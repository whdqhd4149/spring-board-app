package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindController {

    @GetMapping("/fine/changePassword")
    public String changePassword(){
        return "find/changePassword";
    }


    @GetMapping("/fine/password")
    public String password(){
        return "find/password";
    }


    @GetMapping("/fine/resultUserId")
    public String resultUserId(){
        return "find/resultUserId";
    }


    @GetMapping("/fine/userId")
    public String userId(){
        return "find/userId";
    }





}
