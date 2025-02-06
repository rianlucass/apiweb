package br.com.rianlucass.apiweb.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest req) {
        req.setAttribute("nome", "Rian Lucas Com Servlet");
        return "hello";
    }

    @GetMapping("/hello-model")
    public String hello(Model model) {
        model.addAttribute("nome", "Rian Lucas Com Model");
        return "hello";
    }

    @GetMapping("/hello-mv")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome", "Rian Lucas Com ModelAndView");
        return mv;
    }

}
