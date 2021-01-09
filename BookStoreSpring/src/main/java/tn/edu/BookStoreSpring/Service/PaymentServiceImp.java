package tn.edu.BookStoreSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.edu.BookStoreSpring.Repository.PaymentRepository;

@Service
public class PaymentServiceImp implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;
}
