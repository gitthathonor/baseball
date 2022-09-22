package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamListDto {
	private Integer id;
	private String stadiumName;
	private String teamName;
	private Timestamp createdAt;
}
