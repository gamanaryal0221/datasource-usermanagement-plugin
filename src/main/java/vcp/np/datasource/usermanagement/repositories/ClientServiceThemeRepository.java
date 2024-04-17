package vcp.np.datasource.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vcp.np.datasource.usermanagement.domains.ClientServiceTheme;
import java.util.List;;

public interface ClientServiceThemeRepository extends JpaRepository<ClientServiceTheme, Long> {
    
    List<ClientServiceTheme> findAllByClientId(Long clientId);
    
}
