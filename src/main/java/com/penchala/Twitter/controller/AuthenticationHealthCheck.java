
@RestController
@RequestMapping(/application)
public class AuthenticationHealthCheck{

	@GetMapping("/HealthCheck")
	public String HealthCheck(){
		return "KEEP_ALIVE_OK";
		//end of method HealthCheck
	}
	//end of class HealthCheck
}
