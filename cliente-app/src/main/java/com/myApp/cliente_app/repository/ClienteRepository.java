
package com.myApp.cliente_app.repository;

import com.myApp.cliente_app.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
