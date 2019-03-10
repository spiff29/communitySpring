package community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/demo")
public class MainController {
	@Autowired
	private MemberRepository memberRepository;

	@GetMapping(path="/all")
	public @ResponseBody
	String getAllUsers() {
		List l = (List) memberRepository.findAll();
		for (Object o : l) {
			o.toString();
		}
		return memberRepository.findAll().toString();
	}
}
