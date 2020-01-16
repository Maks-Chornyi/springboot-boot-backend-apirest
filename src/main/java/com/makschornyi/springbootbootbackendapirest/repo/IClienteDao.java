package com.makschornyi.springbootbootbackendapirest.repo;

import com.makschornyi.springbootbootbackendapirest.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
