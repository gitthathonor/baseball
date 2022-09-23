package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.expelled.ExpelledDao;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.request.expelled.ExpelledDto;
import site.metacoding.baseball.web.dto.request.player.DeleteCheckedDto;
import site.metacoding.baseball.web.dto.request.player.SaveDto;
import site.metacoding.baseball.web.dto.response.ExpelledListDto;
import site.metacoding.baseball.web.dto.response.PlayerListDto;
import site.metacoding.baseball.web.dto.response.PositionDto;

@Service
@RequiredArgsConstructor
public class PlayerService {
	
	private final TeamDao teamDao;
	private final PlayerDao playerDao;
	private final ExpelledDao expelledDao;
	
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
	
	public void 선수삭제(Integer id) {
		playerDao.deleteById(id);
	}
	
	public void 선수한번에삭제(DeleteCheckedDto deleteCheckedDto) {
		System.out.println("서비스 실행시작");
		playerDao.deleteByIds(deleteCheckedDto.getIds());
		System.out.println("서비스 실행완료");
	}
	
	public List<PositionDto> 포지션별선수보기() {
		return playerDao.findByPosition();
	}
	
	@Transactional(rollbackFor = RuntimeException.class)
	public void 선수퇴출(ExpelledDto expelledDto) {
		expelledDao.insert(expelledDto.toEntity(expelledDto.getPlayerId(), expelledDto.getReason()));
		playerDao.updateByExpelled(expelledDto.getPlayerId());
	}
	
	public List<ExpelledListDto> 퇴출선수목록보기() {
		return expelledDao.findAllExpelled();
	}
	
	public List<Player> 선수퇴출시선수목록보기() {
		return playerDao.findAll();
	}
	
}
