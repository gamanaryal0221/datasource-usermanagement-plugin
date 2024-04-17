package vcp.np.datasource.usermanagement.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_info")
public class UserInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "created_by_user_id", nullable = false)
    private User createdBy;
    
    @ManyToOne
    @JoinColumn(name = "last_updated_by_user_id", nullable = false)
    private User lastUpdatedBy;
    
    @ManyToOne
    @JoinColumn(name = "created_from_client_id", nullable = false)
    private Client createdFromClient;

    public User getCreatedBy() {
        return createdBy;
    }

    public User getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Client getCreatedFromClient() {
        return createdFromClient;
    }
    
    
}
