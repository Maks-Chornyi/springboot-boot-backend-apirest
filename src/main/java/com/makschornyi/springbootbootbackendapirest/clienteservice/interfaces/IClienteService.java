package com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces;

import com.makschornyi.springbootbootbackendapirest.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();

    Cliente save(Cliente cliente);

    void delete(Long id);

    Cliente findById(Long id);

    Cliente updateCliente(Cliente cliente, Long id);
}
