package site.metacoding.baseball.web.dto.request.expelled;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.expelled.Expelled;

@Getter
@Setter
public class ExpelledDto {
	private Integer playerId;
	private String reason;
	
	public Expelled toEntity(Integer playerId, String reason) {
		return new Expelled(this.playerId, this.reason);
	}
}
