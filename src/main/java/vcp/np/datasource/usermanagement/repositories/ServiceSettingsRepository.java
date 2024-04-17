package vcp.np.datasource.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vcp.np.datasource.usermanagement.domains.ServiceSettings;


public interface ServiceSettingsRepository extends JpaRepository<ServiceSettings, Long> {
}
