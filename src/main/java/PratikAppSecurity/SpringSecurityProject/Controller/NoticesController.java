package PratikAppSecurity.SpringSecurityProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNotice(){
        return "here are the notice details from the db";
    }
}
