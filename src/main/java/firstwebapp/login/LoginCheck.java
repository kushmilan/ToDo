package firstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginCheck {
	
	public boolean isValid(String name, String password){
		return name.equals("milan") && password.equals("abcd");
	}
}
