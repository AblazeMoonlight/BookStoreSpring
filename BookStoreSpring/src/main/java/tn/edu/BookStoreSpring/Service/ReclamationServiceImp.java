package tn.edu.BookStoreSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.edu.BookStoreSpring.Repository.ReclamationRepository;

@Service
public class ReclamationServiceImp implements ReclamationService{

    @Autowired
    ReclamationRepository reclamationRepository;
}
