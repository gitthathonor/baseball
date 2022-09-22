package site.metacoding.baseball.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
	public List<Stadium> findAll();
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
