package site.metacoding.baseball.domain.expelled;

import java.util.List;

import site.metacoding.baseball.web.dto.response.ExpelledListDto;

public interface ExpelledDao {
	public void insert(Expelled expelled);
	public Expelled findById(Integer id);
	public List<Expelled> findAll();
	public List<ExpelledListDto> findAllExpelled();
	public void update(Expelled expelled);
	public void deleteById(Integer id);
}
