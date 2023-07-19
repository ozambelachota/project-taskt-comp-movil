package model;

public class Usuario {
    private int id_usuario;
    private String userName;
    private String passowrd;

    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Usuario(String userName, String passowrd) {
        this.userName = userName;
        this.passowrd = passowrd;
    }

    public Usuario(int id_usuario, String userName, String passowrd) {
        this.id_usuario = id_usuario;
        this.userName = userName;
        this.passowrd = passowrd;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
