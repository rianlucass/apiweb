package br.com.rianlucass.apiweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/ola")
    public String exibirPag(Model model) {
        model.addAttribute("nome", "Olá Model");
        return "hello";
    }

    @GetMapping("/hello")
    public ModelAndView exibirPag() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome","Olá Model and View");
        return mv;
    }

}
