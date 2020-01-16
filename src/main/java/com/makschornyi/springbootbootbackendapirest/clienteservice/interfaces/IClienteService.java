package com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces;

import com.makschornyi.springbootbootbackendapirest.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();
}
