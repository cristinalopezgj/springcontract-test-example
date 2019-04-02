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

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
