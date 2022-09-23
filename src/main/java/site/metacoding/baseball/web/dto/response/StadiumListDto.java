package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StadiumListDto {
	private Integer rownum;
	private Integer id;
	private String name;
	private Timestamp createdAt;
}
