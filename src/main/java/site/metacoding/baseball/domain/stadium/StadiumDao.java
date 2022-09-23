package site.metacoding.baseball.domain.stadium;

import java.util.List;

import site.metacoding.baseball.web.dto.response.StadiumListDto;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
	public List<StadiumListDto> findAll();
	public List<Stadium> findAllWithTeam();
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
