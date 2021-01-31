package tn.edu.BookStoreSpring.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.edu.BookStoreSpring.DOA.ErrorCode;
import tn.edu.BookStoreSpring.DOA.ErrorData;
import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.DOA.UserRole;
import tn.edu.BookStoreSpring.Service.UserService;
import tn.edu.BookStoreSpring.validators.DataValidator;
import tn.edu.BookStoreSpring.validators.ValidatorResult;

@RestController
@RequestMapping("register")
public class RegisterController {
/*    private final UserService userService;

    private final DataValidator<User> accountDataValidator;


    public RegisterController(@Qualifier("userService")UserService userService, DataValidator<User> accountDataValidator) {
        this.userService = userService;
        this.accountDataValidator = accountDataValidator;
    }
    @PostMapping(path = "")
    public ResponseEntity register(@RequestBody final User userData) {

        final ValidatorResult validatorResult = this.accountDataValidator.validate(userData);
        ErrorData error = new ErrorData();

        if (!validatorResult.isValid()) {
            error.setCode(validatorResult.getMainErrorCode());
            error.setMessage(validatorResult.getMainErrorMessage());
            error.setDetailedMessage(validatorResult.getErrors().stream().reduce("", (acc, err) -> acc + err + "\n\r"));
            return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
        }

    final String role = userData.getRole();

        // Encrypt password
        //final String encryptedPassword = bCryptPasswordEncoder.encode(accountData.getPassword());
        //accountData.setPassword(encryptedPassword);

        if (UserRole.CLIENT.toString().equals(role)) {


            final boolean result = this.userService.addUser(userData);
            if (result)
                return new ResponseEntity(HttpStatus.OK);
            else
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        } else if (UserRole.ADMIN.toString().equals(role)) {

            final boolean result = this.userService.addUser(userData);
            if (result)
                return new ResponseEntity(HttpStatus.OK);
            else
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        } else

        error = new ErrorData(ErrorCode.FIELD_INVALID_DATA, String.format("Unknown role given `%s`", role));
        return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
    }*/



}
