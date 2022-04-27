package mounir.me.springmvc;

import mounir.me.springmvc.repositories.patientRepository;
import mounir.me.springmvc.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
//        for (int i = 0; i < 10; i ++)
//        {
//            pr.save(
//                    new Patient(null, "mounir"  , new Date(), Math.random() > 0.5, (int) (Math.random() * 10)));
//        }

    try {
//        securityService.saveNewUser("ismail", "ismail", "ismail");
//        securityService.saveNewUser("mohammed", "mohammed", "mohammed");
//        securityService.saveNewUser("mohammed", "mounir", "mounir");
//
//
//        securityService.saveNewRole("USER", "utilisateur simple");
//        securityService.saveNewRole("ADMIN", "Administrateur de l'application");
//
//
//        securityService.addRoleToUser("mohammed", "ADMIN");
//        securityService.addRoleToUser("mounir", "ADMIN");
//        securityService.addRoleToUser("ismail", "USER");
//        securityService.addRoleToUser("user1", "USER");
//
//        securityService.saveNewUser("admin", "admin", "admin");
//
//        securityService.addRoleToUser("admin", "ADMIN");
//        securityService.addRoleToUser("admin", "USER");
//

    }
    catch(Exception e){
        e.printStackTrace();
    }

    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }

}
