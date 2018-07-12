package org.young.service;

import org.young.domain.BoardVO;

public interface BoardService {

	void create(BoardVO vo);
	BoardVO read();
	void update();
	void delete();
	
}
