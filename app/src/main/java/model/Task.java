package model;

import java.util.Date;

public class Task {
    private int idTask;
    private String nombreTask;
    private boolean completedTask;
    private Date fechaInicioTask;
    private Date fechaFinalTask;

    public Task(){
        this.idTask=0;
        this.completedTask=false;
    }
    public Task(int id){
        this.idTask=id;
    }
    public Task(String nombreTask, Date fechaInicioTask,Date fechaFinalTask )  {
        this.nombreTask=nombreTask;
        this.completedTask=false;
        this.fechaInicioTask=fechaInicioTask;
        this.fechaFinalTask=fechaFinalTask;
    }

    public Task(int idTask, String nombreTask, boolean completedTask, Date fechaInicioTask, Date fechaFinalTask) {
        this.idTask = idTask;
        this.nombreTask = nombreTask;
        this.completedTask = completedTask;
        this.fechaInicioTask = fechaInicioTask;
        this.fechaFinalTask = fechaFinalTask;
    }

    public String getNombreTask() {
        return nombreTask;
    }

    public void setNombreTask(String nombreTask) {
        this.nombreTask = nombreTask;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public boolean isCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(boolean completedTask) {
        this.completedTask = completedTask;
    }

    public Date getFechaInicioTask() {
        return fechaInicioTask;
    }

    public void setFechaInicioTask(Date fechaInicioTask) {
        this.fechaInicioTask = fechaInicioTask;
    }

    public Date getFechaFinalTask() {
        return fechaFinalTask;
    }

    public void setFechaFinalTask(Date fechaFinalTask) {
        this.fechaFinalTask = fechaFinalTask;
    }
}
