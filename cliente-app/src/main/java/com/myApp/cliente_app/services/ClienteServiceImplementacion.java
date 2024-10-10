
package com.myApp.cliente_app.services;

import com.myApp.cliente_app.model.Cliente;
import com.myApp.cliente_app.repository.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplementacion implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;  

    @Override
    public Cliente newCliente(Cliente cliente) {
    return clienteRepository.save(cliente);
}

    @Override
    public Iterable<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {
    // Buscar el cliente por su id
        Optional<Cliente> clienteEncontrado = this.clienteRepository.findById(cliente.getIdCliente());
    
    // Si el cliente existe (Optional.isPresent()), actualizamos sus datos
    if (clienteEncontrado.get()!=null) {
       clienteEncontrado.get().setNomcliente(cliente.getNomcliente());
       clienteEncontrado.get().setApellido(cliente.getApellido());
       clienteEncontrado.get().setEmail(cliente.getEmail());
        // Guardar el cliente actualizado en el repositorio
        return this.newCliente(clienteEncontrado.get());
        }
        return null;
    }



    @Override
    public Boolean deleteCliente(Long idcliente) {
        this.clienteRepository.deleteById(idcliente);
        return null;
    }
    
}
