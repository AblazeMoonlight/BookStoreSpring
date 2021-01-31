package tn.edu.BookStoreSpring.DOA;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class UserFavoriteBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    User user;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private Set<Book> books;
    
    
}
