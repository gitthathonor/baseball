package site.metacoding.baseball.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.team.Team;

@Getter
@Setter
public class SaveDto {
	private Integer stadiumId;
	private String name;
	
	public Team toEntity(Integer stadiumId, String name) {
		Team team = new Team(this.stadiumId, this.name);
		return team;
	}
}
