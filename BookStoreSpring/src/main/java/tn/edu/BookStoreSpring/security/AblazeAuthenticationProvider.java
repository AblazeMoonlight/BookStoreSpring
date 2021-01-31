package tn.edu.BookStoreSpring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.Service.UserService;


@Component
public class AblazeAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    UserService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String email = authentication.getName();
        final String password = authentication.getCredentials().toString();

        if (this.userService != null) {
            User user = this.userService.loadByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                return new UsernamePasswordAuthenticationToken(email, password);
            }else {
                throw new BadCredentialsException("Bad Credentials");
            }
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}