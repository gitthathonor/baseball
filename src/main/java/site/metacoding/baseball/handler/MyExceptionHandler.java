package site.metacoding.baseball.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;

import site.metacoding.baseball.handler.ex.MyApiException;
import site.metacoding.baseball.handler.ex.MyException;
import site.metacoding.baseball.util.Script;
import site.metacoding.baseball.web.dto.CMRespDto;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(MyException.class)
	public String normalError(Exception e) {
		return Script.back(e.getMessage());
	}
	
	@ExceptionHandler(MyApiException.class)
	public @ResponseBody CMRespDto<?> apiError(Exception e) {
		return new CMRespDto<>(-1, e.getMessage(), null);
	}
	
}
