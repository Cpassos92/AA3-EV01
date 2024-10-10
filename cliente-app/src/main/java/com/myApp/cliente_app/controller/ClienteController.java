
package com.myApp.cliente_app.controller;

import com.myApp.cliente_app.model.Cliente;
import com.myApp.cliente_app.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    // Crear un nuevo cliente
    @PostMapping("/nuevo")
    public Cliente newCliente(@RequestBody Cliente newCliente){
        return this.clienteService.newCliente(newCliente);
    }
    
    //obtener todos loas clientes
    @GetMapping("/mostrarCliente")
    public Iterable<Cliente> getAll(){
        return clienteService.getAll();
    }
    
    //modificar un cliente
    @PostMapping ("/modificar")
    public Cliente UpdateCliente(@RequestBody Cliente cliente){
        return this.clienteService.modifyCliente(cliente);
    }
    
    
    //eliminar un cliente
    @PostMapping(value="/{id}")
    public Boolean delteCliente(@PathVariable(value="id")Long id){
       return this.clienteService.deleteCliente(id);
    }
}
