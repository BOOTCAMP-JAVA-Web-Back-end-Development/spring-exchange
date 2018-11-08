package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExchangeController {
    @GetMapping("/")
    public String Exchange(){
        return "index";
    }

    @PostMapping("/")
    public ModelAndView Exchange(@RequestParam("Rate") String rate, @RequestParam("Amount") String amount){
        int r = Integer.parseInt(rate);
        int a = Integer.parseInt(amount);
        double n = r*a;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("n",n);
        return modelAndView;
    }
}
