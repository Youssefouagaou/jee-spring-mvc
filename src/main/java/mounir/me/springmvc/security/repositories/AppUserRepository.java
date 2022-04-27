package mounir.me.springmvc.security.repositories;

import mounir.me.springmvc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    public AppUser findByUsername(String username);
}
