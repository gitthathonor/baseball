package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;
	
	public Team(Integer stadiumId, String name) {
		this.stadiumId = stadiumId;
		this.name = name;
	}
}
