package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.request.team.SaveDto;
import site.metacoding.baseball.web.dto.response.TeamListDto;

@Service
@RequiredArgsConstructor
public class TeamService {
	
	private final TeamDao teamDao;
	private final StadiumDao stadiumDao;
	
	public void 팀등록(SaveDto saveDto) {
		Team team = saveDto.toEntity(saveDto.getStadiumId(), saveDto.getName());
		teamDao.insert(team);
	}
	
	public List<TeamListDto> 팀목록보기() {
		return teamDao.findAllWithStadium();
	}
	
	public List<Stadium> 팀등록시구장목록보기() {
		return stadiumDao.findAll();
	}
}
