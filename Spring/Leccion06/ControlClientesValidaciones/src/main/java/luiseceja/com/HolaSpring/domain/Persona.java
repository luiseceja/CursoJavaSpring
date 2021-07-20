/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiseceja.com.HolaSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;


import lombok.Data;

/**
 *
 * @author luisc
 */
@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String telefono;
}
