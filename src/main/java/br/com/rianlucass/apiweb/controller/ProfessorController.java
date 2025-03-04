package br.com.rianlucass.apiweb.controller;

import br.com.rianlucass.apiweb.model.Professor;
import br.com.rianlucass.apiweb.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository repository;

    @GetMapping("/professores")
    public ModelAndView index() {
        List<Professor> professores = this.repository.findAll();
        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);
        return mv;
    }

    @GetMapping("/professores/cadastrar")
    public String cadastro() {
        return "professores/formulario";
    }

}
