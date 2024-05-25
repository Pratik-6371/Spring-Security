package PratikAppSecurity.SpringSecurityProject.Repository;

import PratikAppSecurity.SpringSecurityProject.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByEmail(String email);
}
