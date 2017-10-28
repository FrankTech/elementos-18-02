
package org.unitec.elementos1801;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Usuario {
    
    
    
    @Id
    private Integer cuenta;
    private String nombre;
    private String email;

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(Integer cuenta, String nombre, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    
    
}
