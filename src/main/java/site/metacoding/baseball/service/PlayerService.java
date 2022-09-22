package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.request.player.SaveDto;
import site.metacoding.baseball.web.dto.response.PlayerListDto;

@Service
@RequiredArgsConstructor
public class PlayerService {
	
	private final TeamDao teamDao;
	private final PlayerDao playerDao;
	
	public void 선수등록(SaveDto saveDto) {
		Player player = saveDto.toEntity(saveDto.getTeamId(), saveDto.getName(), saveDto.getPosition());
		playerDao.insert(player);
	}
	
	public List<Team> 선수등록시팀목록보기() {
		return teamDao.findAll();
	}
	
	public List<PlayerListDto> 선수목록보기() {
		return playerDao.findAllWithTeam();
	}
	
	public void 선수제명(Integer id) {
		playerDao.deleteById(id);
	}
	
}
