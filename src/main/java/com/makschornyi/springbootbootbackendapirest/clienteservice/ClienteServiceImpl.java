package com.makschornyi.springbootbootbackendapirest.clienteservice;

import com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces.IClienteService;
import com.makschornyi.springbootbootbackendapirest.model.Cliente;
import com.makschornyi.springbootbootbackendapirest.repo.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    private final IClienteDao clienteDao;

    @Autowired
    public ClienteServiceImpl(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
