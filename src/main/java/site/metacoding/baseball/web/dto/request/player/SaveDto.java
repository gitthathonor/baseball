package site.metacoding.baseball.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.stadium.Stadium;

@Getter
@Setter
public class SaveDto {
	private String name;
	
	public void toEntity(String name) {
		Stadium stadium = new Stadium(this.name);
	}
}
