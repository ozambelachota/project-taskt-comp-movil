package model;

public class Client {
    private int id_client;
    private String nombre_client;
    private String apellido_client;
    private int edad_client;
    private String telefono_client;

    public Client(int id_client) {
        this.id_client = id_client;
    }

    public Client(String nombre_client, String apellido_client, int edad_client, String telefono_client) {
        this.nombre_client = nombre_client;
        this.apellido_client = apellido_client;
        this.edad_client = edad_client;
        this.telefono_client = telefono_client;
    }

    public Client(int id_client, String nombre_client, String apellido_client, int edad_client, String telefono_client) {
        this.id_client = id_client;
        this.nombre_client = nombre_client;
        this.apellido_client = apellido_client;
        this.edad_client = edad_client;
        this.telefono_client = telefono_client;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNombre_client() {
        return nombre_client;
    }

    public void setNombre_client(String nombre_client) {
        this.nombre_client = nombre_client;
    }

    public String getApellido_client() {
        return apellido_client;
    }

    public void setApellido_client(String apellido_client) {
        this.apellido_client = apellido_client;
    }

    public int getEdad_client() {
        return edad_client;
    }

    public void setEdad_client(int edad_client) {
        this.edad_client = edad_client;
    }

    public String getTelefono_client() {
        return telefono_client;
    }

    public void setTelefono_client(String telefono_client) {
        this.telefono_client = telefono_client;
    }
}
