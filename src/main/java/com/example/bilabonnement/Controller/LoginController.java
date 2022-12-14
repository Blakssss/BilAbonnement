package com.example.bilabonnement.Controller;

import com.example.bilabonnement.Model.UserModel;
import com.example.bilabonnement.Service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    LoginService loginService = new LoginService();


    //Marcus, Mathias
    @PostMapping("/login")
    public String login(HttpSession session, WebRequest webRequest){
         //Get info fra username og password felt fra html siden
    UserModel userModel = new UserModel(webRequest.getParameter("userName"),webRequest.getParameter("userPassword"));
    int userId = loginService.login(userModel);

    //hvis UserID er = -1 bliver man redirected til den samme login side, hvilket vil sige at du ikke kommer ind
    if(userId == -1){
        return "/Login";

    }
    //tilføjer en cookie i browser der hedder userID med int variablen userID
    session.setAttribute("userID", userId);
    return "redirect:/dataregistrering";
    }
}
