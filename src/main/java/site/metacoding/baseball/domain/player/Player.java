package site.metacoding.baseball.domain.player;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private Timestamp createdAt;
}
