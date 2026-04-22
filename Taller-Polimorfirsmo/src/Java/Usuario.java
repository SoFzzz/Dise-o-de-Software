package Java;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String celular;
    private String tokenDispositivo;


    public Usuario() {
    }

    public Usuario(String id, String nombre, String email, String celular, String tokenDispositivo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.tokenDispositivo = tokenDispositivo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTokenDispositivo() {
        return tokenDispositivo;
    }

    public void setTokenDispositivo(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }
}
