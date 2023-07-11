package model;

public class health {
    private int idHealth;
    private String nombreClient;
    private double pesoHealth;
    private double tallaHealth;

    public health() {
    }

    public health(int idHealth) {
        this.idHealth = idHealth;
    }

    public health(String nombreClient, double pesoHealth, double tallaHealth) {
        this.nombreClient = nombreClient;
        this.pesoHealth = pesoHealth;
        this.tallaHealth = tallaHealth;
    }

    public health(int idHealth, String nombreClient, double pesoHealth, double tallaHealth) {
        this.idHealth = idHealth;
        this.nombreClient = nombreClient;
        this.pesoHealth = pesoHealth;
        this.tallaHealth = tallaHealth;
    }

    public int getIdHealth() {
        return idHealth;
    }

    public String getNombreClient() {
        return nombreClient;
    }

    public void setNombreClient(String nombreClient) {
        this.nombreClient = nombreClient;
    }

    public double getPesoHealth() {
        return pesoHealth;
    }

    public void setPesoHealth(double pesoHealth) {
        this.pesoHealth = pesoHealth;
    }

    public double getTallaHealth() {
        return tallaHealth;
    }

    public void setTallaHealth(double tallaHealth) {
        this.tallaHealth = tallaHealth;
    }
}

