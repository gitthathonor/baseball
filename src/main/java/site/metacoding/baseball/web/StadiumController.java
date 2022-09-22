package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.CMRespDto;
import site.metacoding.baseball.web.dto.request.stadium.SaveDto;

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
	public String saveForm() {
		return "stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadium/save")
	public String save(SaveDto saveDto) {
		stadiumService.경기장등록(saveDto);
		return "redirect:/stadium";
		//return new CMRespDto<>(1, "야구장 등록 성공", null);
	}
	
	@DeleteMapping("/stadium/{id}/delete")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer id) {
		stadiumService.경기장삭제(id);
		return new CMRespDto<>(1, "경기장 삭제 완료", null);
	}
}
