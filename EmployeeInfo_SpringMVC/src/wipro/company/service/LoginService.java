package wipro.company.service;

import org.springframework.stereotype.Component;

import wipro.company.model.Login;

@Component
public class LoginService {

	public boolean isValidUser(Login login) {
		if (login.getUname() != null && login.getPw() != null && login.getUname().equals("admin")
				&& login.getPw().equals("admin")) {
			return true;
		}
		
	return false;

	}
}
