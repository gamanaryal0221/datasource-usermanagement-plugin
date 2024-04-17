package vcp.np.datasource.usermanagement.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import vcp.np.datasource.usermanagement.domains.UserInfo;


public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    Optional<UserInfo> findByUserId(Long userId);

}