package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
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
		Stadium stadium = saveDto.toEntity(saveDto.getName());
		stadiumDao.insert(stadium);
	}
	
	
	public void 경기장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
}
