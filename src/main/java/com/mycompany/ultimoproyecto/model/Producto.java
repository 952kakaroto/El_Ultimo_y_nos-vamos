/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultimoproyecto.model;

/**
 *
 * @author LENOVO
 */
public class Producto {
    private String ID;
    private String PRODUCTO;
    private Integer PRECIO_UNITARIO;
    private Integer Cantidad;

    public Producto(String ID, String PRODUCTO, Integer PRECIO_UNITARIO, Integer Cantidad) {
        this.ID = ID;
        this.PRODUCTO = PRODUCTO;
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
        this.Cantidad = Cantidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPRODUCTO() {
        return PRODUCTO;
    }

    public void setPRODUCTO(String PRODUCTO) {
        this.PRODUCTO = PRODUCTO;
    }

    public Integer getPRECIO_UNITARIO() {
        return PRECIO_UNITARIO;
    }

    public void setPRECIO_UNITARIO(Integer PRECIO_UNITARIO) {
        this.PRECIO_UNITARIO = PRECIO_UNITARIO;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", PRODUCTO=" + PRODUCTO + ", PRECIO_UNITARIO=" + PRECIO_UNITARIO + ", Cantidad=" + Cantidad + '}';
    }
   
}
