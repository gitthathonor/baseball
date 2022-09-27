package site.metacoding.baseball.domain.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import site.metacoding.baseball.web.dto.response.PlayerListDto;
import site.metacoding.baseball.web.dto.response.PositionDto;

public interface PlayerDao {
	public void insert(Player player);
	public Player findById(Integer id);
	public List<Player> findAll();
	public List<PlayerListDto> findAllWithTeam();
	public void update(Player player);
	public void deleteById(Integer id);
	public void updateByExpelled(Integer id);
	public void deleteByIds(@Param("ids") int[] ids);
	
	
	// 테스트
	
	public List<String> findTeamName();
	public List<Map<String, Object>> findByPosition(@Param("teamNameList") List<String> teamNameList);
}
