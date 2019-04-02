package com.springcontract.controlador;

import com.springcontract.bean.Cliente;
import com.springcontract.servicio.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ControladorCliente {

    @Autowired
    private final ServicioCliente servicioCliente;

    public ControladorCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/clientes")
    @ResponseBody
    public List<Cliente>getListaClientes() throws Exception {
        return  servicioCliente.obtenerListaClientes();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cliente/{id}")
    @ResponseBody
    public Cliente getCliente(@PathVariable("id") int id) throws Exception {
        return servicioCliente.obtenerClientePorID(id);
    }


}
