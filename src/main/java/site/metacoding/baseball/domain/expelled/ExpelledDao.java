package site.metacoding.baseball.domain.expelled;

import java.util.List;

public interface ExpelledDao {
	public void insert(Expelled stadium);
	public Expelled findById(Integer id);
	public List<Expelled> findAll();
	public void update(Expelled stadium);
	public void deleteById(Integer id);
}
