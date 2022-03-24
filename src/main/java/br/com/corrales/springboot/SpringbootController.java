package br.com.corrales.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootController {
    @GetMapping("/page")
    public String testeHome(){
        return ("<h2>Bem vindo a nossa pagina!</h2><hr></hr><h4>Desenvolvido por Philippe Corrales!</h4><hr></hr>");
    }

}

