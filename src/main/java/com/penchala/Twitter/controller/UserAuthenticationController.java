
@RestController 
public class UserAuthenticationController{

	@Autowire
	UserAuthenticationService authenticate;

	public Boolean ValidateUser(String userName,String password){
		return authenticate(userName,password)
		//end of validateUser 
	}
	//end of class UserAuthenticationController 
}
