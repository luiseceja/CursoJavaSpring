/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiseceja.com.HolaSpring.servicio;

import java.util.List;
import luiseceja.com.HolaSpring.dao.IPersonaDao;
import luiseceja.com.HolaSpring.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
/**
 *
 * @author luisc
 */
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    private IPersonaDao ipersonadao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
       return (List<Persona>) ipersonadao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        ipersonadao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        ipersonadao.delete(persona);
    }

  

    @Override
    @Transactional(readOnly = true)
    public Persona buscar(Persona persona) {
       return ipersonadao.findById(persona.getIdPersona()).orElse(null);
    }

   
    
}
