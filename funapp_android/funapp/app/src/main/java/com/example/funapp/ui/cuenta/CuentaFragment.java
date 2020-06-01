package com.example.funapp.ui.cuenta;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.funapp.R;
import com.example.funapp.activities.MainActivity;
import com.example.funapp.login.LoginActivity;
import com.example.funapp.models.Entidad;
import com.example.funapp.models.Evento;
import com.example.funapp.models.Tematica;
import com.example.funapp.models.Ubicacion;
import com.example.funapp.models.Usuario;
import com.example.funapp.models.UsuarioEstandar;
import com.example.funapp.models.UsuarioResponsable;
import com.example.funapp.ui.miseventos.crear_editar_evento.CrearEditarEventoActivity;
import com.example.funapp.util.Protocolo;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaFragment extends Fragment implements Protocolo {

    private CuentaViewModel cuentaViewModel;
    private Usuario usuario;
    private Integer tipoUsuario;
    private int estadoSesion;

    private static final String CERO = "0";
    private static final String BARRA = "-";
    public final Calendar c = Calendar.getInstance();
    final int mes = c.get(Calendar.MONTH);
    final int dia = c.get(Calendar.DAY_OF_MONTH);
    final int anio = c.get(Calendar.YEAR);
    private MessageDigest md;

    EditText etCuentaFechaNacimiento;
    ImageButton ibObtenerFecha;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usuario = null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cuentaViewModel =
                ViewModelProviders.of(this).get(CuentaViewModel.class);
        this.usuario = ((MainActivity) getActivity()).getUsuario();
        this.tipoUsuario = ((MainActivity) getActivity()).getTipoUsuario();

        View root = null;

        if (this.tipoUsuario == SESION_ABIERTA_RESPONSABLE) {

            root = inflater.inflate(R.layout.fragment_cuenta_responsable, container, false);

            final EditText etCuentaSeudonimo = root.findViewById(R.id.etCuentaSeudonimo);
            final EditText etCuentaContrasenia = root.findViewById(R.id.etCuentaContrasenia);
            final EditText etCuentaContraseniaConfirmar = root.findViewById(R.id.etCuentaContraseniaConfirmar);
            etCuentaFechaNacimiento = root.findViewById(R.id.etCuentaFechaNacimiento);
            final EditText etCuentaCorreo = root.findViewById(R.id.etCuentaCorreo);
            ibObtenerFecha = root.findViewById(R.id.ibMiCuentaFecha);
            final Button confirmarButton = root.findViewById(R.id.bCuentaConfirmar);

            etCuentaSeudonimo.setText(usuario.getSeudonimo());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            etCuentaFechaNacimiento.setText(usuario.getFecha_ingreso_LocalDate().format(formatter));

            //Responsable
            final EditText etCuentaNombre = root.findViewById(R.id.etCuentaNombre);
            final EditText etCuentaApellidos = root.findViewById(R.id.etCuentaApellidos);
            final EditText etCuentaDNI = root.findViewById(R.id.etCuentaDNI);
            final EditText etCuentaTelefono = root.findViewById(R.id.etCuentaTelefono);

            //Entidad
            final EditText etCuentaNombre2 = root.findViewById(R.id.etCuentaNombre2);
            final EditText etEntidadNIF = root.findViewById(R.id.etEntidadNIF);
            final EditText etEntidadCalle = root.findViewById(R.id.etEntidadCalle);
            final EditText etEntidadProvincia = root.findViewById(R.id.etEntidadProvincia);
            final EditText etEntidadLocalidad = root.findViewById(R.id.etEntidadLocalidad);
            final EditText etEntidadTelefono = root.findViewById(R.id.etEntidadTelefono);
            final EditText etEntidadCodigoPostal = root.findViewById(R.id.etEntidadCodigoPostal);

            final UsuarioResponsable[] usuarioResponsable = new UsuarioResponsable[1];
            cuentaViewModel.getUsuario(usuario.getId_usuario()).observe(getViewLifecycleOwner(), new Observer<UsuarioResponsable>() {
                @Override
                public void onChanged(@Nullable UsuarioResponsable usuario) {
                    usuarioResponsable[0] = usuario;
                    etCuentaNombre.setText(usuario.getNombre());
                    etCuentaApellidos.setText(usuario.getApellido());
                    etCuentaDNI.setText(usuario.getDni());
                    etCuentaTelefono.setText(usuario.getTelefono());
                }
            });

            final Entidad[] entidad = {new Entidad()};
            cuentaViewModel.getEntidad(usuario.getId_usuario()).observe(getViewLifecycleOwner(), new Observer<Entidad>() {
                @Override
                public void onChanged(@Nullable Entidad e) {
                    entidad[0] = e;
                    etCuentaNombre2.setText(e.getNombre());
                    etEntidadNIF.setText(e.getNif());
                    etEntidadCalle.setText(e.getCalle());
                    etEntidadProvincia.setText(e.getProvincia());
                    etEntidadLocalidad.setText(e.getLocalidad());
                    etEntidadTelefono.setText(e.getTelefono());
                    etEntidadCodigoPostal.setText(e.getCodigo_postal());
                }
            });

            ibObtenerFecha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    obtenerFecha();
                }
            });

            confirmarButton.setOnClickListener(new View.OnClickListener() {

                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onClick(View view) {
                    if (!TextUtils.isEmpty(etCuentaSeudonimo.getText()) &&
                            !TextUtils.isEmpty(etCuentaContrasenia.getText()) &&
                            !TextUtils.isEmpty(etCuentaContraseniaConfirmar.getText()) &&
                            !TextUtils.isEmpty(etCuentaFechaNacimiento.getText()) &&
                            !TextUtils.isEmpty(etCuentaCorreo.getText()) &&
                            !TextUtils.isEmpty(etCuentaNombre.getText()) &&
                            !TextUtils.isEmpty(etCuentaApellidos.getText()) &&
                            !TextUtils.isEmpty(etCuentaDNI.getText()) &&
                            !TextUtils.isEmpty(etCuentaTelefono.getText()) &&
                            !TextUtils.isEmpty(etCuentaNombre2.getText()) &&
                            !TextUtils.isEmpty(etEntidadNIF.getText()) &&
                            !TextUtils.isEmpty(etEntidadCalle.getText()) &&
                            !TextUtils.isEmpty(etEntidadProvincia.getText()) &&
                            !TextUtils.isEmpty(etEntidadLocalidad.getText()) &&
                            !TextUtils.isEmpty(etEntidadTelefono.getText()) &&
                            !TextUtils.isEmpty(etEntidadCodigoPostal.getText())) {

                        String fechaEvento = etCuentaFechaNacimiento.getText().toString();
                        Date fechaNacimientoDate = null;
                        try {
                            fechaNacimientoDate = new SimpleDateFormat("dd-MM-yyyy").parse(fechaEvento);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        UsuarioResponsable usuarioRes = new UsuarioResponsable(etCuentaDNI.getText().toString(), etCuentaNombre.getText().toString(),
                                etCuentaApellidos.getText().toString(), etCuentaTelefono.getText().toString(), usuario.getId_usuario(), etCuentaSeudonimo.getText().toString(),
                                etCuentaCorreo.getText().toString(), fechaNacimientoDate, null, encriptacion(etCuentaContrasenia.getText().toString()), null);

                        estadoSesion = cuentaViewModel.actualizarUsuarioResponsable(usuarioRes);
                        if (estadoSesion == ACTUALIZAR_EXITO) {
                            Toast.makeText(getActivity(), "El usuario se ha actualizado con éxito", Toast.LENGTH_SHORT).show();
                        } else if (estadoSesion == ACTUALIZAR_FALLIDO) {
                            Toast.makeText(getActivity(), "No se ha podido actualizar el usuario", Toast.LENGTH_SHORT).show();
                        }

                        Entidad e = new Entidad(entidad[0].getId_entidad(), etCuentaNombre2.getText().toString(), etEntidadNIF.getText().toString(),
                                etEntidadCalle.getText().toString(), etEntidadProvincia.getText().toString(),
                                etEntidadLocalidad.getText().toString(), etEntidadCodigoPostal.getText().toString(),
                                etEntidadTelefono.getText().toString(), usuario.getId_usuario());

                        estadoSesion = cuentaViewModel.actualizarEntidad(e);
                        if (estadoSesion == ACTUALIZAR_EXITO) {
                            Toast.makeText(getActivity(), "La entidad se ha actualizado con éxito", Toast.LENGTH_SHORT).show();
                        } else if (estadoSesion == ACTUALIZAR_FALLIDO) {
                            Toast.makeText(getActivity(), "No se ha podido actualizar la entidad", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });


        } else if (this.tipoUsuario == SESION_ABIERTA_ESTANDAR) {

            root = inflater.inflate(R.layout.fragment_cuenta_estandar, container, false);

            Usuario u = ((MainActivity) getActivity()).getUsuario();

            final EditText etCuentaSeudonimo = root.findViewById(R.id.etCuentaSeudonimo);
            final EditText etCuentaContrasenia = root.findViewById(R.id.etCuentaContrasenia);
            final EditText etCuentaContraseniaConfirmar = root.findViewById(R.id.etCuentaContraseniaConfirmar);
            etCuentaFechaNacimiento = root.findViewById(R.id.etCuentaFechaNacimiento);
            final EditText etCuentaCorreo = root.findViewById(R.id.etCuentaCorreo);
            ibObtenerFecha = root.findViewById(R.id.ibMiCuentaFecha);
            final Button confirmarButton = root.findViewById(R.id.bCuentaConfirmar);

            etCuentaSeudonimo.setText(usuario.getSeudonimo());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            etCuentaFechaNacimiento.setText(usuario.getFecha_ingreso_LocalDate().format(formatter));

            ibObtenerFecha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    obtenerFecha();
                }
            });

            confirmarButton.setOnClickListener(new View.OnClickListener() {

                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onClick(View view) {
                    if (!TextUtils.isEmpty(etCuentaSeudonimo.getText()) &&
                            !TextUtils.isEmpty(etCuentaContrasenia.getText()) &&
                            !TextUtils.isEmpty(etCuentaContraseniaConfirmar.getText()) &&
                            !TextUtils.isEmpty(etCuentaFechaNacimiento.getText()) &&
                            !TextUtils.isEmpty(etCuentaCorreo.getText())) {

                        String fechaEvento = etCuentaFechaNacimiento.getText().toString();
                        Date fechaNacimientoDate = null;
                        try {
                            fechaNacimientoDate = new SimpleDateFormat("dd-MM-yyyy").parse(fechaEvento);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        u.setSeudonimo(etCuentaSeudonimo.getText().toString());
                        u.setContrasenia(encriptacion(etCuentaContrasenia.getText().toString()));
                        u.setFecha_nac(fechaNacimientoDate);
                        u.setEmail(etCuentaCorreo.getText().toString());

                        estadoSesion = cuentaViewModel.actualizarUsuarioEstandar(u);

                        if (estadoSesion == ACTUALIZAR_EXITO) {
                            Toast.makeText(getActivity(), "El usuario se ha actualizado con éxito", Toast.LENGTH_SHORT).show();
                        } else if (estadoSesion == ACTUALIZAR_FALLIDO) {
                            Toast.makeText(getActivity(), "No se ha podido actualizar el usuario", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }

        return root;
    }


    public void obtenerFecha() {
        DatePickerDialog recogerFecha = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                //Esta variable lo que realiza es aumentar en uno el mes ya que comienza desde 0 = enero
                final int mesActual = month + 1;
                //Formateo el día obtenido: antepone el 0 si son menores de 10
                String diaFormateado = (dayOfMonth < 10) ? CERO + String.valueOf(dayOfMonth) : String.valueOf(dayOfMonth);
                //Formateo el mes obtenido: antepone el 0 si son menores de 10
                String mesFormateado = (mesActual < 10) ? CERO + String.valueOf(mesActual) : String.valueOf(mesActual);
                //Muestro la fecha con el formato deseado
                etCuentaFechaNacimiento.setText(diaFormateado + BARRA + mesFormateado + BARRA + year);
            }
            //Estos valores deben ir en ese orden, de lo contrario no mostrara la fecha actual
            /**
             *También puede cargar los valores que quiera
             */
        }, anio, mes, dia);
        //Muestro el widget
        recogerFecha.show();
    }

    public String encriptacion(String cadena) {

        String cadenaEncriptada = "";
        try {
            this.md = MessageDigest.getInstance("SHA-512");
            this.md.update(cadena.getBytes());
            byte[] mb = md.digest();
            cadenaEncriptada = String.copyValueOf(Hex.encodeHex(mb));
            System.out.println(cadenaEncriptada);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cadenaEncriptada;
    }
}
