package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.web.dto.response.PlayerListDto;

@Service
@RequiredArgsConstructor
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public void 선수등록() {
		
	}
	
	public List<PlayerListDto> 선수목록보기() {
		return playerDao.findAllWithTeam();
	}
	
}
