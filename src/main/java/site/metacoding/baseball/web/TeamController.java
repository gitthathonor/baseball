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
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.CMRespDto;
import site.metacoding.baseball.web.dto.request.team.SaveDto;
import site.metacoding.baseball.web.dto.response.StadiumListDto;
import site.metacoding.baseball.web.dto.response.TeamListDto;

@Controller
@RequiredArgsConstructor
public class TeamController {
	
	private final TeamService teamService;
	
	@GetMapping("/team")
	public String getTeamList(Model model) {
		List<TeamListDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "team/teamList";
	}
	
	@GetMapping("/team/saveForm")
	public String saveForm(Model model) {
		List<Stadium> stadiumList = teamService.팀등록시구장목록보기();
		model.addAttribute("stadiumList",stadiumList);
		return "team/teamSaveForm";
	}
	
	@PostMapping("/team/save")
	public @ResponseBody CMRespDto<?> save(@RequestBody SaveDto saveDto) {
		teamService.팀등록(saveDto);
		return new CMRespDto<>(1, "팀 등록이 완료되었습니다.", null);
	}
	
	@DeleteMapping("/team/{id}/delete")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer id) {
		teamService.팀해체(id);
		return new CMRespDto<>(1, id+"팀 해체 완료!", null);
	}
	
}
