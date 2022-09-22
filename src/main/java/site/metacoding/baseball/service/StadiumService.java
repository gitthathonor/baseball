package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;

@Service
@RequiredArgsConstructor
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public List<Stadium> 경기장목록보기() {
		return stadiumDao.findAll();
	}
}
