package com.example.bilabonnement.Controller;

import com.example.bilabonnement.Model.LejeAftaleModel;
import com.example.bilabonnement.Service.SkadeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;


@Controller
public class SkadeController {

    SkadeService skadeService = new SkadeService();


    @GetMapping ("/findBil")
    public String SkadeRegNr () {
        return "SkadeRegNr";
    }

    @PostMapping("/visLejekontrakt")
    public String showContract(WebRequest req, HttpSession session){
        LejeAftaleModel lejeaftale = skadeService.findEnLejekontrakt(req.getParameter("RegNr"));
        System.out.println(lejeaftale);
        session.setAttribute("lejeaftale",lejeaftale);
        return "registrerSkade";
    }

    @GetMapping("/opretSkadeAngivelse")
    public String skadeAngivelse(){

    return "opretSkadeAngivelse";
    }









    @GetMapping("/skadeliste")
    public String visSkadeListe(Model model) {
        model.addAttribute("SkadeListe", skadeService.getAllSkader());
        return "/skade/seOgRedigerSkader";
    }

}