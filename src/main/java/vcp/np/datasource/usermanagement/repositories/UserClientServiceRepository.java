package vcp.np.datasource.usermanagement.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import vcp.np.datasource.usermanagement.domains.User;
import vcp.np.datasource.usermanagement.domains.UserClientService;


public interface UserClientServiceRepository extends JpaRepository<UserClientService, Long> {

    List<UserClientService> findAllByUser(User user);

    Page<UserClientService> findAll(Specification<UserClientService> specification, Pageable pageable);

}
