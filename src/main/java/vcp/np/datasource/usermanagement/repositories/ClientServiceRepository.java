package vcp.np.datasource.usermanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vcp.np.datasource.usermanagement.domains.Client;
import vcp.np.datasource.usermanagement.domains.ClientService;
import vcp.np.datasource.usermanagement.domains.Service;


public interface ClientServiceRepository extends JpaRepository<ClientService, Long> {

    List<ClientService> findAllByClientIn(List<Client> clientList);
    List<ClientService> findAllByServiceIn(List<Service> serviceList);
    List<ClientService> findAllByClientInAndServiceIn(List<Client> client, List<Service> serviceList);
}
