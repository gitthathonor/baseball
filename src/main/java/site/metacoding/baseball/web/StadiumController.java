package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;

@Controller
@RequiredArgsConstructor
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping("/stadium")
	public String getStadiumList(Model model) {
		List<Stadium> stadiumList = stadiumService.경기장목록보기();
		model.addAttribute("stadiumList",stadiumList);
		return "stadium/stadiumList";
	}
	
	
	@GetMapping("/stadium/saveForm")
	public String registerStadium() {
		return "stadium/stadiumSaveForm";
	}
}
