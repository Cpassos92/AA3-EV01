
package com.myApp.cliente_app.services;

import com.myApp.cliente_app.model.Cliente;


public interface ClienteService {
    Cliente newCliente(Cliente cliente);
    Iterable<Cliente> getAll();
    Cliente modifyCliente (Cliente cliente);
    Boolean deleteCliente(Long idcliente);
    
    
}
