/*
 * package tn.edu.BookStoreSpring.validators;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import tn.edu.BookStoreSpring.DOA.ErrorCode;
import tn.edu.BookStoreSpring.DOA.User;
import static tn.edu.BookStoreSpring.Constants.DataValidatorMessages.*;


@Component

 public class AccountDataValidator implements DataValidator<User> {

   @Override
    public ValidatorResult validate(User data) {
        if (data == null) {
            return new ValidatorResult(false, ErrorCode.FIELD_INVALID_DATA, INVALID_OBJECT);
        }

        // Validate client data

            if (StringUtils.isEmpty(data.getFirstName())) {
                return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_FIRSTNAME);
            }
            if (StringUtils.isEmpty(data.getLastName())) {
                return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_lASTNAME);
            }



        if (StringUtils.isEmpty(data.getPassword())) {
            return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_PASSWORD);
        }

        if ((StringUtils.isEmpty(data.getRole()))) {
            return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_ROLE);
        }

        if (StringUtils.isEmpty(data.getEmail())) {
            return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_EMAIL);
        }

        if (StringUtils.isEmpty(data.getPhone())) {
            return new ValidatorResult(false, ErrorCode.FIELD_MISSING_DATA, MISSING_PHONE);
        }

        if (StringUtils.length(data.getPhone()) != 8) {
            ValidatorResult validatorResult = new ValidatorResult(false, ErrorCode.FIELD_INVALID_DATA, INVALID_PHONE);
            validatorResult.addError(INVALID_PHONE_LENGTH);
            return validatorResult;
        }

        return new ValidatorResult(true);
    }


}
*/
