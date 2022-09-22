package site.metacoding.baseball.web.dto.request.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.stadium.Stadium;

@Getter
@Setter
public class SaveDto {
	private String name;
	
	public Stadium toEntity(String name) {
		Stadium stadium = new Stadium(this.name);
		return stadium;
	}
}
