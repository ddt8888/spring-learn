package co.kimsang.springpjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 나는 컨트롤러에요 라는 어노테이션 클래스에서만 사용가능
@Controller
public class HomeController {
	// 어떤 요청이 들어오면 그 아래 것들을 실행시키라는 어노테이션
	// RequestMapping은 get, post를 처리해준다
	// GetMapping은 get만 , PostMapping는 post만 처리한다.
	@RequestMapping("/home.do")
	public String home(Model model) {	// Model은 돌려줄 값을 실어주는 객체
		return "home/home";
	}
	
	@RequestMapping("/buttons.do")
	public String button(Model model) {
		return "home/bb";
	}

}
