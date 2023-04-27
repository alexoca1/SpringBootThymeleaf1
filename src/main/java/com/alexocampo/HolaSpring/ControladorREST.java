package com.alexocampo.HolaSpring;

import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import com.alexocampo.domain.Individuo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {

        @Value("${indice.hola2}")
        private String hola2;

        @GetMapping("/")
        public String comienzo(Model model) {
                String hola = "Hola mundo con Spring Boot";

                Individuo individuo = new Individuo();
                individuo.setNombre("Andres");
                individuo.setApellido("Marin");
                individuo.setEdad("26");
                individuo.setCorreo("andres@gmail.com");
                individuo.setTelefono("4387264538");

                Individuo individuo2 = new Individuo();
                individuo2.setNombre("Karla");
                individuo2.setApellido("Martinez");
                individuo2.setEdad("35");
                individuo2.setCorreo("karla@gmail.com");
                individuo2.setTelefono("456546432");
                
             //   List<Individuo> individuos= new ArrayList();
              //  individuos.add(individuo);
              //  individuos.add(individuo2);
                
                List individuos = Arrays.asList(individuo, individuo2);

                log.info("estoy ejecutando el controlador MVC");

                model.addAttribute("hola", hola);
                model.addAttribute("hola2", hola2);
                model.addAttribute("individuo", individuo);
                model.addAttribute("individuos", individuos);

                //log.debug("Mas informacion");
                return "indice";
        }

}
