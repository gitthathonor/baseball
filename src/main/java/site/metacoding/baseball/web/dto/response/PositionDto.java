package site.metacoding.baseball.web.dto.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.team.Team;

@Getter
@Setter
public class PositionDto {
	private List<String> teamNameList;
}
