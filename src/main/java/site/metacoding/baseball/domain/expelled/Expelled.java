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
	private String name;
	private Timestamp createdAt;
	
	public Expelled(String name) {
		this.name = name;
	}
}
