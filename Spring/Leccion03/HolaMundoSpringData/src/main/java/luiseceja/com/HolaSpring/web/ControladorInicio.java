package luiseceja.com.HolaSpring.web;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import luiseceja.com.HolaSpring.dao.IPersonaDao;
import luiseceja.com.HolaSpring.domain.Persona;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorInicio {
 @Autowired
 private IPersonaDao  ipersonaDao;

   
    @GetMapping("/")
    public String inicio(Model model) {
       var personas = ipersonaDao.findAll();
        log.info("Ejecutando el controlador Spring MVC");
    
       
       model.addAttribute("personas", personas);
        return "index";

    }
}
