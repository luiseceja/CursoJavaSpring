package luiseceja.com.HolaSpring.web;


import lombok.extern.slf4j.Slf4j;
import luiseceja.com.HolaSpring.servicio.PersonaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorInicio {
 @Autowired
 private PersonaService personaservice;

   
    @GetMapping("/")
    public String inicio(Model model) {
       var personas = personaservice.listarPersonas();
        log.info("Ejecutando el controlador Spring MVC");
    
       
       model.addAttribute("personas", personas);
        return "index";

    }
}
