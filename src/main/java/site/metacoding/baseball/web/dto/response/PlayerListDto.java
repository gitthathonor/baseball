package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerListDto {
	private Integer id;
	private String teamName;
	private String position;
	private String name;
	private Timestamp createdAt;
}
