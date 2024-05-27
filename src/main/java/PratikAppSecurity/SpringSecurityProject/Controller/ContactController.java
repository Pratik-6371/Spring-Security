package PratikAppSecurity.SpringSecurityProject.Controller;

import PratikAppSecurity.SpringSecurityProject.Model.Contact;
import PratikAppSecurity.SpringSecurityProject.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Random;

@RestController
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/contact")
    public Contact saveContactEnquiryDetails(@RequestBody Contact contact) {
        contact.setContactId(getServiceRequestMethod());
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        return contactRepository.save(contact);
    }



    public String getServiceRequestMethod() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + ranNum;
    }
}
