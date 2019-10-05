package edu.mum.controllers;

import edu.mum.data.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    ServletContext context;

    @RequestMapping("/")
    public String Index() {
        return "login";
    }


    @RequestMapping("/advice")
    public String Advice(Model model, @RequestParam String roast) {
        DataFacade data = (DataFacade) context.getAttribute("dataSource");
        List<String> advice = data.getAdvice(roast);
        model.addAttribute("advice", advice);
        return "display";
    }

    @PostMapping("/authenticate")
    public String Authenticate(Model model, @RequestParam String name, @RequestParam String password) {

        DataFacade data = (DataFacade) context.getAttribute("dataSource");
        String expectedPassword = data.findPassword(name);

        if (expectedPassword == null){
            model.addAttribute("error","Username error!!");
            return "login";
        } else if(!expectedPassword.equals(password)) {
            model.addAttribute("error","Invalid password!!");
            return "login";
        } else{
            return "redirect:/authenticated";
        }
    }

    @RequestMapping("/authenticated")
    public String authenticated(){
        return "advice";
    }

}
