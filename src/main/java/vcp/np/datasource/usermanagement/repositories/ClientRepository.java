package vcp.np.datasource.usermanagement.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import vcp.np.datasource.usermanagement.domains.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllByNameOrDisplayName(String clientNameOrDisplayName, String clientNameOrDisplayName2);

}
