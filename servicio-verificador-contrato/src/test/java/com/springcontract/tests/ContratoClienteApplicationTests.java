package com.springcontract.tests;

import com.springcontract.bean.Cliente;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.springcontract.test:servicio-clientes:+:stubs:8080", workOffline = true)
public class ContratoClienteApplicationTests {

    @Test
    public void Deberia_Obtener_Listado_Clientes() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ArrayList> lista_clientes = restTemplate.getForEntity("http://localhost:8080/clientes", ArrayList.class);

        Assert.assertTrue(lista_clientes.getBody().size() > 0);
    }

    @Test
    public void Deberia_Obtener_Datos_Cliente() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Cliente> cliente = restTemplate.getForEntity("http://localhost:8080/cliente/1", Cliente.class);

        Assert.assertTrue(cliente.getBody().getIdcliente() == 1);
        Assert.assertTrue(cliente.getBody().getNombre().equals("Cristina"));
        Assert.assertTrue(cliente.getBody().getApellidos().equals("López"));
        Assert.assertTrue(cliente.getBody().getCiudad().equals("Barcelona"));
        Assert.assertTrue(cliente.getBody().getProvincia().equals("Barcelona"));
    }

}
