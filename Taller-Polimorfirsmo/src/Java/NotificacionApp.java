package Java;

import java.time.LocalDateTime;

public class NotificacionApp extends Notificacion {
    private String tokenDispositivo;
    private String appId;


    public NotificacionApp() {
    }

    public NotificacionApp(String codigo, Usuario destinatario, String mensaje, LocalDateTime fechaEnvio,
                          EstadoNotificacion estado, TipoNotificacion tipo, String tokenDispositivo,
                          String appId) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, tipo);
        this.tokenDispositivo = tokenDispositivo;
        this.appId = appId;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push a través de la app " + appId);
        System.out.println("Token del dispositivo: " + tokenDispositivo);
        System.out.println("Mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADA);
    }


    public String getTokenDispositivo() {
        return tokenDispositivo;
    }

    public void setTokenDispositivo(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
