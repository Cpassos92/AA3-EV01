
package com.myApp.cliente_app.model;

//clase para elaborar la entidad  de la aplicacion

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column
    private Long idCliente;

    
    @Column
    private String nomcliente;
    
    @Column
    private String apellido;
    
    @Column
    private String email;
    
   
}
