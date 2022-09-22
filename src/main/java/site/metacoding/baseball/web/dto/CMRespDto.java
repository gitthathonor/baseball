package site.metacoding.baseball.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CMRespDto<T> {
	private Integer code; // 1이면 정상, -1이면 비정상
	private String msg;
	private T data;
}
