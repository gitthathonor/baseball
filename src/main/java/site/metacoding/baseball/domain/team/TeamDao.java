package site.metacoding.baseball.domain.team;

import java.util.List;

import site.metacoding.baseball.web.dto.response.TeamListDto;


public interface TeamDao {
	public void insert(Team team);
	public Team findById(Integer id);
	public List<Team> findAll();
	public List<TeamListDto> findAllWithStadium();
	public void update(Team team);
	public void deleteById(Integer id);
}
