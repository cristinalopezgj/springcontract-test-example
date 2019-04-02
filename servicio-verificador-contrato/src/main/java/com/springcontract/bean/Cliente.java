package com.springcontract.bean;

public class Cliente {

    int idcliente;
    String nombre;
    String apellidos;
    String ciudad;
    String provincia;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String apellidos, String ciudad, String provincia) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

}
