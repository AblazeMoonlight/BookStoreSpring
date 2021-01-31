package tn.edu.BookStoreSpring.validators;


import tn.edu.BookStoreSpring.DOA.DAO;

public interface DataValidator<User extends DAO> {
    public ValidatorResult validate(User data);
}
