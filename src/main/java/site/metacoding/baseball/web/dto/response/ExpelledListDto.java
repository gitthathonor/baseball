package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpelledListDto {
	private Integer rownum;
	private String teamName;
	private String position;
	private String playerName;
	private String reason;
	private Timestamp expelledDate;
}
