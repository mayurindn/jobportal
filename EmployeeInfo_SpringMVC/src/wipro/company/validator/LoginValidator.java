package wipro.company.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import wipro.company.model.Login;

@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
			return Login.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		
		Login userlogin=(Login)arg0;
		
		if(userlogin.getUname().equals(""))
		{
			errors.reject("test", "Please provide Username");
		}
		
		
		
	}

}
