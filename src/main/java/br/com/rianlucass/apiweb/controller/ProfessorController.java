package br.com.rianlucass.apiweb.controller;

import br.com.rianlucass.apiweb.model.Professor;
import br.com.rianlucass.apiweb.model.StatusProfessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {

    @GetMapping("/professores")
    public ModelAndView index() {
        Professor rian = new Professor("Rian lucas", BigDecimal.valueOf(25000.0), StatusProfessor.ATIVO);
        rian.setId(1);
        Professor erica = new Professor("Erica Oliveira", BigDecimal.valueOf(15000.0), StatusProfessor.ATIVO);
        erica.setId(2);
        Professor enzo = new Professor("Enzo Lucas", BigDecimal.valueOf(10000.0), StatusProfessor.APOSENTADO);
        enzo.setId(3);
        List<Professor> professores = Arrays.asList(rian, erica, enzo);
        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);
        return mv;
    }

}
