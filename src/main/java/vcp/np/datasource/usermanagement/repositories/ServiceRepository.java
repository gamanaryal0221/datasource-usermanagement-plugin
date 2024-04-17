package vcp.np.datasource.usermanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vcp.np.datasource.usermanagement.domains.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    List<Service> findAllByNameOrDisplayName(String serviceNameOrDisplayName, String serviceNameOrDisplayName2);

}
