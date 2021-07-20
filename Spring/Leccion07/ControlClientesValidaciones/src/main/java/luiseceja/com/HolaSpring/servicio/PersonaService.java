/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiseceja.com.HolaSpring.servicio;

import java.util.List;
import luiseceja.com.HolaSpring.domain.Persona;

/**
 *
 * @author luisc
 */
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona buscar(Persona persona);
    
}
