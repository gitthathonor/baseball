package site.metacoding.baseball.domain.expelled;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Expelled {
	private Integer id;
	private Integer playerId;
	private String reason;
	private Timestamp createdAt;
	
	public Expelled(Integer playerId, String reason) {
		this.playerId = playerId;
		this.reason = reason;
	}
}
