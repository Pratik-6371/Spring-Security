package PratikAppSecurity.SpringSecurityProject.Controller;

import PratikAppSecurity.SpringSecurityProject.Model.Customer;
import PratikAppSecurity.SpringSecurityProject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

   @PostMapping("/register")
   public ResponseEntity<String> registerUser(@RequestBody Customer customer){
       Customer savedCustomer=null;
       ResponseEntity response=null;
       try{
           String hashpwd=passwordEncoder.encode(customer.getPwd());
           customer.setPwd(hashpwd);
           savedCustomer=customerRepository.save(customer);
           if(savedCustomer.getId()>0){
               response=ResponseEntity.status(HttpStatus.CREATED)
                       .body("Given user details are sucessfully registered");


           }
       }catch(Exception e){
           response=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body("An exception occured due to " +e.getMessage());

       }
       return response;
   }













}
