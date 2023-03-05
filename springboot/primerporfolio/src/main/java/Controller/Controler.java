package Controller;

import com.porfolio.primerporfolio.model.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controler {

    List<Persona> listaPersonas = new ArrayList();

    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "Hola mundo " + nombre;
    }

    @GetMapping ("/chau")
    public String decirChau (@RequestParam String nombre, @RequestParam String apellido,
                             @RequestParam int edad)
    {
        return "Chau mundo " + nombre +" " +apellido +" "+edad;
    }

    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        listaPersonas.add(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return listaPersonas;
    }


}
