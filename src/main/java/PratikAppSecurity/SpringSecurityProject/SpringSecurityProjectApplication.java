package PratikAppSecurity.SpringSecurityProject;

import PratikAppSecurity.SpringSecurityProject.Controller.WelcomeController;
import PratikAppSecurity.SpringSecurityProject.config.PratikBankUserDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WelcomeController.class),

        //Exclude this class because we are no more use this class to use bydefault Authentication provider for Authentication
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = PratikBankUserDetails.class)

})

public class SpringSecurityProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityProjectApplication.class, args);
    }

}
