package luiseceja.com.HolaSpring;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import luiseceja.com.HolaSpring.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Mensaje con thymeleaf";

        var persona = new Persona();
        persona.setApellido("ceja");
        persona.setNombre("luis");
        persona.setEmail("zoidsxr@gmail.com");
        persona.setTelefono("5526072197");
        var persona2 = new Persona();
        persona2.setApellido("cejal");
        persona2.setNombre("luisl");
        persona2.setEmail("zoidsxr@gmaill.com");
        persona2.setTelefono("5526072197l");
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        
//       var personas =new ArrayList();
//       personas.add(persona);
//       personas.add(persona2);
       
       var personas = Arrays.asList(persona,persona2);
       
       model.addAttribute("personas", personas);
        return "index";

    }
}
