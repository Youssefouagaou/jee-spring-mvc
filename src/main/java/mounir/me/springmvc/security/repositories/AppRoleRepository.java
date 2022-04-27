package mounir.me.springmvc.security.repositories;

import mounir.me.springmvc.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    public AppRole findByRole(String role);
}
