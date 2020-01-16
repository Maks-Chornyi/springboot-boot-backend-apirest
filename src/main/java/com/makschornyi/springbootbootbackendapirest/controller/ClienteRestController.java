package com.makschornyi.springbootbootbackendapirest.controller;

import com.makschornyi.springbootbootbackendapirest.clienteservice.ClienteServiceImpl;
import com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces.IClienteService;
import com.makschornyi.springbootbootbackendapirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    private final IClienteService clienteService;

    @Autowired
    public ClienteRestController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<Cliente> index() {
        List<Cliente> clientes = clienteService.findAll();
        System.out.println(clientes);
        return clientes;
    }
}
