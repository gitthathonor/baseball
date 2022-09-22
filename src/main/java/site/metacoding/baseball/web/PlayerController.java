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
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.PlayerService;
import site.metacoding.baseball.web.dto.CMRespDto;
import site.metacoding.baseball.web.dto.request.player.SaveDto;
import site.metacoding.baseball.web.dto.response.PlayerListDto;

@Controller
@RequiredArgsConstructor
public class PlayerController {
	
	private final PlayerService playerService;
	
	@GetMapping("/player")
	public String getPlayerList(Model model) {
		List<PlayerListDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList",playerList);
		return "player/playerList";
	}
	
	@GetMapping("player/saveForm")
	public String saveForm(Model model) {
		List<Team> teamList = playerService.선수등록시팀목록보기();
		model.addAttribute("teamList", teamList);
		return "player/playerSaveForm";
	}
	
	@PostMapping("/player/save")
	public @ResponseBody CMRespDto<?> save(@RequestBody SaveDto saveDto) {
		playerService.선수등록(saveDto);
		return new CMRespDto<>(1, "선수 등록이 완료되었습니다.", null);
	}
	
	@DeleteMapping("/player/{id}/delete")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer id) {
		playerService.선수제명(id);
		return new CMRespDto<>(1, id+"선수 제명 완료", null);
	}
	
	
}
