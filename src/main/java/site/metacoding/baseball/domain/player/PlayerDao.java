package site.metacoding.baseball.domain.player;

import java.util.List;

import site.metacoding.baseball.web.dto.response.PlayerListDto;

public interface PlayerDao {
	public void insert(Player player);
	public Player findById(Integer id);
	public List<Player> findAll();
	public List<PlayerListDto> findAllWithTeam();
	public void update(Player player);
	public void deleteById(Integer id);
}
