package com.alexocampo.HolaSpring;

import ch.qos.logback.classic.spi.ThrowableProxyUtil;
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

                model.addAttribute("hola", hola);
                model.addAttribute("hola2", hola2);
                log.info("estoy ejecutando el controlador MVC");
                //log.debug("Mas informacion");
                return "indice";
        }

}
