package com.makschornyi.springbootbootbackendapirest.controller;

import com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces.IClienteService;
import com.makschornyi.springbootbootbackendapirest.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente createCliente(@RequestBody Cliente newCliente) {
        return clienteService.save(newCliente);
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable Long id) {
        return clienteService.updateCliente(cliente, id);
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCliente(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
