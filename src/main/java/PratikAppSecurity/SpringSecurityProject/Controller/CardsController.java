package PratikAppSecurity.SpringSecurityProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getCardDetails() {
        return "here are the card details from db";
    }
}
