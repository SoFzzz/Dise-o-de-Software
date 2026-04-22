package Java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones {
    private List<Usuario> usuarios;
    private List<Notificacion> historial;


    public SistemaNotificaciones() {
        this.usuarios = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    public NotificacionEmail crearEmail() {
        return new NotificacionEmail();
    }

    public NotificacionSms crearSms() {
        return new NotificacionSms();
    }

    public NotificacionApp crearApp() {
        return new NotificacionApp();
    }


    public void enviarNotificacion(Notificacion notificacion) {
        notificacion.enviar();
        historial.add(notificacion);
    }


    public List<Notificacion> getHistorial() {
        return new ArrayList<>(historial);
    }


    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public Usuario buscarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}
