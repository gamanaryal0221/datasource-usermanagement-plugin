package vcp.np.datasource.usermanagement.domains;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "soft_deleted", columnDefinition = "BIT DEFAULT 0")
    private boolean softDeleted = false;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "mail_address", nullable = false)
    private String mailAddress;

    @Column(name = "number")
    private String number;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @ManyToOne
    @JoinColumn(name = "employer_id", nullable = false)
    private Client employer;

    @Column(name = "salt_value", nullable = false, length = 255)
    private String saltValue;

    @Column(name = "password", nullable = false, length = 500)
    private String password;
    

	@PrePersist
	protected void onCreate() {
		createdAt = new Timestamp(System.currentTimeMillis());
	}

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }
    

    public User() {
    }
    
    

	public User(String username, String firstName, String middleName, String lastName, String mailAddress) {
        this.username = username;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
    }

    public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public String getNumber() {
		return number;
	}

    public String getSaltValue() {
        return saltValue;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [username=" + username + "]";
    }

    public String getFullname() {
        return firstName + " " + ((middleName != null && !middleName.isEmpty())? (middleName + " "):"") + lastName;
    }

    public void setEmployer(Client employer) {
        this.employer = employer;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Client getEmployer() {
        return employer;
    }

}
