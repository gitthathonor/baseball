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
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.PlayerService;
import site.metacoding.baseball.web.dto.CMRespDto;
import site.metacoding.baseball.web.dto.request.expelled.ExpelledDto;
import site.metacoding.baseball.web.dto.request.player.DeleteCheckedDto;
import site.metacoding.baseball.web.dto.request.player.SaveDto;
import site.metacoding.baseball.web.dto.response.ExpelledListDto;
import site.metacoding.baseball.web.dto.response.PlayerListDto;
import site.metacoding.baseball.web.dto.response.PositionDto;

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
	
	/*
	 * @DeleteMapping("/player/{id}/delete") public @ResponseBody CMRespDto<?>
	 * delete(@PathVariable Integer id) { playerService.선수삭제(id); return new
	 * CMRespDto<>(1, id+"선수 삭제 완료", null); }
	 */
	
	@DeleteMapping("/player/delete")
	public @ResponseBody CMRespDto<?> delete(@RequestBody DeleteCheckedDto deleteCheckedDto) {
		playerService.선수한번에삭제(deleteCheckedDto);
		return new CMRespDto<>(1, "선수 삭제 완료", null);
	}
	
	@GetMapping("/position")
	public String getPositionList(Model model) {
		List<PositionDto> positionList = playerService.포지션별선수보기();
		model.addAttribute("positionList", positionList);
		return "position/positionList";
	}
	
	@GetMapping("/expelled")
	public String getExpelledList(Model model) {
		List<ExpelledListDto> expelledList = playerService.퇴출선수목록보기();
		model.addAttribute("expelledList", expelledList);
		return "expelled/expelledList";
	}
	
	@GetMapping("/expelledForm")
	public String expelledForm(Model model) {
		List<Player> playerList = playerService.선수퇴출시선수목록보기();
		model.addAttribute("playerList", playerList);
		return "expelled/expelledSaveForm";
	}
	
	@PostMapping("/expelled")
	public @ResponseBody CMRespDto<?> expelled(@RequestBody ExpelledDto expelledDto) {
		playerService.선수퇴출(expelledDto);
		return new CMRespDto<>(1, "선수 퇴출 완료", null);
	}
	
	
}
