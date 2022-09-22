package site.metacoding.baseball.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.stadium.Stadium;

@Getter
@Setter
public class SaveDto {
	private Integer teamId;
	private String name;
	private String position;
	
	public Player toEntity(Integer teamId, String name, String postion) {
		Player player = new Player(this.teamId, this.name, this.position);
		return player;
	}
}
