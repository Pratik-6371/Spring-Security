package PratikAppSecurity.SpringSecurityProject.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import PratikAppSecurity.SpringSecurityProject.Model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
