package luiseceja.com.HolaSpring.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import luiseceja.com.HolaSpring.domain.Persona;
import luiseceja.com.HolaSpring.servicio.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaservice;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        var personas = personaservice.listarPersonas();
       
        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("personas", personas);
        model.addAttribute("usuario",user);
        return "index";

    }
    @GetMapping("/agregar")
    public String agregar(Persona persona){
      return "modificar";
    }
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona,Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaservice.guardar(persona);
        return "redirect:/";
    }
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
       persona= personaservice.buscar(persona);
       model.addAttribute("persona",persona);
        return "modificar";
    }
    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona){
        personaservice.eliminar(persona);
        return "redirect:/";
    }
}
