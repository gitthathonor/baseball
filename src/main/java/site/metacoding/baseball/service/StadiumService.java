package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.handler.ex.MyApiException;
import site.metacoding.baseball.handler.ex.MyException;
import site.metacoding.baseball.web.dto.request.stadium.SaveDto;
import site.metacoding.baseball.web.dto.response.StadiumListDto;

@Service
@RequiredArgsConstructor
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public List<StadiumListDto> 경기장목록보기() {
		return stadiumDao.findAll();
	}
	
	public void 경기장등록(SaveDto saveDto) {
//		// 중복되는 경기장 있는지 확인 거쳐야 함
//		Stadium stadiumPS = stadiumDao.findByName(saveDto.getName());
//		System.out.println(stadiumPS.getName());
//		
//		if(stadiumPS != null) {
//			throw new MyException("경기장 이름이 중복됩니다.");
//		} 
		
		Stadium stadium = saveDto.toEntity(saveDto.getName());
		stadiumDao.insert(stadium);
	}
	
	
	public void 경기장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
}
