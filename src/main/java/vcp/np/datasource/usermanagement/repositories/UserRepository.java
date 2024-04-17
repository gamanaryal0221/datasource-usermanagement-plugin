package vcp.np.datasource.usermanagement.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import vcp.np.datasource.usermanagement.domains.User;


public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findAll(Specification<User> specification, Pageable pageable);

    Optional<User> findByUsername(String username);

}
