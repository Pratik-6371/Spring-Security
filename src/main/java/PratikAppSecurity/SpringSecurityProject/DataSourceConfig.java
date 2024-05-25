package PratikAppSecurity.SpringSecurityProject;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//This class is all about for testing purpose********************************
@Component
public class DataSourceConfig {
    
    @Value("${spring.datasource.url}")
    private  String dataSourceUrl;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddlAuto;

    @Value("${spring.datasource.username}")
    private String userName;



    @PostConstruct
    public void init() {
        System.out.println("Datasource URL: " + dataSourceUrl);
        System.out.println("Hibernate DDL Auto: " + ddlAuto);
        System.out.println("DataSource username: " +userName);
    }
}
