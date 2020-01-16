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

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id)
                .orElse(null);
    }

    @Override
    public Cliente updateCliente(Cliente newCliente, Long id) {
        Cliente updatedCliente = findById(id);
        updatedCliente.setApellido(newCliente.getApellido());
        updatedCliente.setEmail(newCliente.getEmail());
        updatedCliente.setNombre(newCliente.getNombre());
        return save(updatedCliente);
    }
}
