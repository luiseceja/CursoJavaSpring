/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiseceja.com.HolaSpring.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

/**
 *
 * @author luisc
 */
@Data 
@Entity
@Table(name="persona")
public class Persona implements  Serializable{
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
