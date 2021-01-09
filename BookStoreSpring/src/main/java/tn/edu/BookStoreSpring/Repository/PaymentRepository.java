package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.edu.BookStoreSpring.DOA.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
