/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultimoproyecto.model;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private String ID;
    private String NOMBRE;
    private String APELLIDO;
    private String EMAIL;
    private String TELEFONO;

    public Cliente(String ID, String NOMBRE, String APELLIDO, String EMAIL, String TELEFONO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.EMAIL = EMAIL;
        this.TELEFONO = TELEFONO;
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

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ID=" + ID + ", NOMBRE=" + NOMBRE + ", APELLIDO=" + APELLIDO + ", EMAIL=" + EMAIL + ", TELEFONO=" + TELEFONO + '}';
    }
   
}
