package mounir.me.springmvc;

import mounir.me.springmvc.entities.Patient;
import mounir.me.springmvc.repositories.patientRepository;
import mounir.me.springmvc.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication

public class SpringMvcApplication implements CommandLineRunner {

    @Autowired
    private patientRepository pr;

    @Autowired
    private SecurityService securityService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i ++)
        {
            pr.save(
                    new Patient(null, "youssef"  , new Date(), Math.random() > 0.5, (int) (Math.random() * 10) + 20));
        }

    /*try {
        securityService.saveNewUser("youssef", "youssef", "youssef");


        securityService.saveNewRole("USER", "utilisateur simple");
        securityService.saveNewRole("ADMIN", "Administrateur de l'application");


        securityService.addRoleToUser("youssef", "ADMIN");
        securityService.addRoleToUser("youssef", "ADMIN");




       securityService.addRoleToUser("youssef", "ADMIN");
        securityService.addRoleToUser("youssef", "USER");


    }
    catch(Exception e){
        e.printStackTrace();
    }*/

    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }

}
