package Java;

import java.time.LocalDateTime;

public class NotificacionSms extends Notificacion {
    private String celularDestinario;
    private String codigoPais;

    // Constructores
    public NotificacionSms() {
    }

    public NotificacionSms(String codigo, Usuario destinatario, String mensaje, LocalDateTime fechaEnvio,
                          EstadoNotificacion estado, TipoNotificacion tipo, String celularDestinario,
                          String codigoPais) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, tipo);
        this.celularDestinario = celularDestinario;
        this.codigoPais = codigoPais;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a: " + codigoPais + celularDestinario);
        System.out.println("Mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADA);
    }


    public String getCelularDestinario() {
        return celularDestinario;
    }

    public void setCelularDestinario(String celularDestinario) {
        this.celularDestinario = celularDestinario;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }
}
