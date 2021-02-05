package tn.edu.BookStoreSpring.DOA;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_User")
public class User extends DAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String firstName;
    private String lastName;
    @Column(name="email", nullable = false, updatable = false)
    private String email;
    private String password;
    private String phone;
    private String role;
    private int hPoints;

    @OneToOne(mappedBy = "user")
    private Payment payment;

    @OneToOne(mappedBy = "user")
    private Cart cart;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reclamation> reclamations;

    public User() {
    }

    public User(Long idUser, String firstName, String lastName, String email, String password, String phone, String role) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public User(Long idUser, String firstName, String lastName, String email, String password, String phone, String role, int hPoints) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.hPoints = hPoints;
    }

    public Long getIdUser() { return idUser; }

    public void setIdUser(Long idUser) { this.idUser = idUser; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public int gethPoints() { return hPoints; }

    public void sethPoints(int hPoints) { this.hPoints = hPoints; }


    public Payment getPayment() { return payment; }

    public void setPayment(Payment payment) { this.payment = payment; }

    public Cart getCart() { return cart; }

    public void setCart(Cart cart) { this.cart = cart; }

    public Set<Comment> getComments() { return comments; }

    public void setComments(Set<Comment> comments) { this.comments = comments; }

    public Set<Reclamation> getReclamations() { return reclamations; }

    public void setReclamations(Set<Reclamation> reclamations) { this.reclamations = reclamations; }
}
