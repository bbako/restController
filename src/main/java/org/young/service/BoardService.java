package org.young.service;

import java.util.List;

import org.young.domain.BaseVO;
import org.young.domain.BoardVO;

public interface BoardService {

	void create(BoardVO vo);
	BoardVO read(BoardVO vo);
	List<BoardVO> readAll(BaseVO vo);
	void update(BoardVO vo);
	void delete(BoardVO vo);
	int total();
	
}
