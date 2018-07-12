package org.young.persistence;

import org.young.domain.BoardVO;

public interface BoardDAO {

	void create(BoardVO vo);
	BoardVO read();
	void update();
	void delete();
	
}
