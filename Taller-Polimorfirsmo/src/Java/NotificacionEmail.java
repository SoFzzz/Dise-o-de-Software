package Java;

import java.time.LocalDateTime;

public class NotificacionEmail extends Notificacion {
    private String emailDestinario;
    private String adjunto;
    private String asunto;


    public NotificacionEmail() {
    }

    public NotificacionEmail(String codigo, Usuario destinatario, String mensaje, LocalDateTime fechaEnvio,
                            EstadoNotificacion estado, TipoNotificacion tipo, String emailDestinario,
                            String adjunto, String asunto) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, tipo);
        this.emailDestinario = emailDestinario;
        this.adjunto = adjunto;
        this.asunto = asunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando email a: " + emailDestinario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + getMensaje());
        if (adjunto != null) {
            System.out.println("Adjunto: " + adjunto);
        }
        setEstado(EstadoNotificacion.ENVIADA);
    }


    public String getEmailDestinario() {
        return emailDestinario;
    }

    public void setEmailDestinario(String emailDestinario) {
        this.emailDestinario = emailDestinario;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
}
