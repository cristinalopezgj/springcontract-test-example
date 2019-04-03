package com.springcontract.servicio;

import com.springcontract.bean.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioCliente {

    public ServicioCliente() {
    }

    public List<Cliente> obtenerListaClientes() {
        List<Cliente> lista_clientes = new ArrayList<>();
        lista_clientes.add(new Cliente(1, "Cristina", "López", "Barcelona","Barcelona"));
        lista_clientes.add(new Cliente(2, "Sandra", "Rodríguez", "Madrid","Madrid"));
        lista_clientes.add(new Cliente(3, "Javier", "López", "Dos Hermanas","Sevilla"));
        return lista_clientes;
    }

    public Cliente obtenerClientePorID(int idcliente) {
        return new Cliente(1, "Cristina", "López", "Barcelona","Barcelona");
    }
}
