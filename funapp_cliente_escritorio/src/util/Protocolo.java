package util;

/**
 *
 * @author melkart
 */
public interface Protocolo {

    public static final Integer SIN_SESION = 0;
    public static final Integer INICIAR_SESION = 1;
    public static final Integer REGISTRARSE_ESTANDAR = 2;
    public static final Integer REGISTRARSE_RESPONSABLE = 3;
    public static final Integer SESION_ABIERTA_ESTANDAR = 4;
    public static final Integer SESION_ABIERTA_RESPONSABLE = 5;
    public static final Integer CERRAR_SESION = 6;
    public static final Integer SESION_FALLIDA = 7;
    public static final Integer REGISTRARSE_FALLIDO = 8;
}