package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stadium {
	private Integer id;
	private String name;
	private Timestamp createdAt;
}
