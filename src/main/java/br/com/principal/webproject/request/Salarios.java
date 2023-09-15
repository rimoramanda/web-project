package br.com.principal.webproject.request;

import jakarta.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Salarios {
    private BigDecimal meuSalarioEstagio = new BigDecimal(1800.00);

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
    path = "salario-estagiario", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getmeuSalarioEstagio() {
        return new ResponseEntity<>(meuSalarioEstagio, HttpStatus.OK);
    }

}
