/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultimoproyecto.model;

/**
 *
 * @author LENOVO
 */
public class Empleados {
    private String ID;
    private String NOMBRE;
    private String TELEFONO;
    private String PUESTO;
    private Integer Salario;

    public Empleados(String ID, String NOMBRE, String TELEFONO, String PUESTO, Integer Salario) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.TELEFONO = TELEFONO;
        this.PUESTO = PUESTO;
        this.Salario = Salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getPUESTO() {
        return PUESTO;
    }

    public void setPUESTO(String PUESTO) {
        this.PUESTO = PUESTO;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Empleados{" + "ID=" + ID + ", NOMBRE=" + NOMBRE + ", TELEFONO=" + TELEFONO + ", PUESTO=" + PUESTO + ", Salario=" + Salario + '}';
    }
    
}
