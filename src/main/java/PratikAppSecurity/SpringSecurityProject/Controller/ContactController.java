package PratikAppSecurity.SpringSecurityProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContactEnquiryDetails(){
        return "Enquiry details are saved to db";
    }
}
