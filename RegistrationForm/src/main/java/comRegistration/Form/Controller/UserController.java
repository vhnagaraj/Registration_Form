package comRegistration.Form.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import comRegistration.Form.Entity.UserEntity;
import comRegistration.Form.Repository.UserRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/")
	public String Home()
	{
		return "index";
	}
	
	@PostMapping("/submit")
	public String Register(@ModelAttribute UserEntity user, HttpSession session)
	{
		System.out.println(user);
		repository.save(user);
		session.setAttribute("message", "user registered successfully");
		return "redirect:/";
	}

}
