/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiseceja.com.HolaSpring.dao;

import luiseceja.com.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luisc
 */
public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
