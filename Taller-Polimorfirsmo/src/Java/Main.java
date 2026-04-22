package Java;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SistemaNotificaciones sistema = new SistemaNotificaciones();

        Usuario usuario1 = new Usuario("U001", "Juan Pérez", "juan@example.com", "3001234567", "token123abc");
        Usuario usuario2 = new Usuario("U002", "María García", "maria@example.com", "3007654321", "token456def");

        sistema.agregarUsuario(usuario1);
        sistema.agregarUsuario(usuario2);


        System.out.println("=== NOTIFICACIÓN POR EMAIL ===");
        NotificacionEmail email = sistema.crearEmail();
        email.setCodigo("N001");
        email.setDestinatario(usuario1);
        email.setMensaje("Se han publicado las calificaciones del período académico");
        email.setFechaEnvio(LocalDateTime.now());
        email.setEstado(EstadoNotificacion.PENDIENTE);
        email.setTipo(TipoNotificacion.PUBLICACION_CALIFICACIONES);
        email.setEmailDestinario("juan@example.com");
        email.setAsunto("Calificaciones Disponibles");
        email.setAdjunto("calificaciones.pdf");
        sistema.enviarNotificacion(email);

        System.out.println("\n=== NOTIFICACIÓN POR SMS ===");
        NotificacionSms sms = sistema.crearSms();
        sms.setCodigo("N002");
        sms.setDestinatario(usuario2);
        sms.setMensaje("Recordatorio: Próximo plazo de matrícula el 15 de junio");
        sms.setFechaEnvio(LocalDateTime.now());
        sms.setEstado(EstadoNotificacion.PENDIENTE);
        sms.setTipo(TipoNotificacion.RECORDATORIO_MATRICULA);
        sms.setCelularDestinario("3007654321");
        sms.setCodigoPais("+57");
        sistema.enviarNotificacion(sms);

        System.out.println("\n=== NOTIFICACIÓN POR APP ===");
        NotificacionApp app = sistema.crearApp();
        app.setCodigo("N003");
        app.setDestinatario(usuario1);
        app.setMensaje("Tu clase de Diseño de Software ha sido confirmada");
        app.setFechaEnvio(LocalDateTime.now());
        app.setEstado(EstadoNotificacion.PENDIENTE);
        app.setTipo(TipoNotificacion.CONFIRMACION_INSCRIPCION);
        app.setTokenDispositivo("token123abc");
        app.setAppId("UCC_APP_v1.0");
        sistema.enviarNotificacion(app);


        System.out.println("\n=== HISTORIAL DE NOTIFICACIONES ===");
        System.out.println("Total de notificaciones enviadas: " + sistema.getHistorial().size());
    }
}
