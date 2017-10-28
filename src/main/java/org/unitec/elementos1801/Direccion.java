
package org.unitec.elementos1801;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Direccion {
    
    @Id
    @GeneratedValue
    Long id;
    
    
    //Esperense
    @OneToOne
    @JoinColumn(name="cuenta")
    Usuario u;
    
    String Calle;
    Integer cp;
    String municipio;
    
    
    
    
}
