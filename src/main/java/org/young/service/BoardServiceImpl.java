package org.young.service;

import javax.inject.Inject;

import org.young.domain.BoardVO;
import org.young.persistence.BoardDAO;

public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO dao;

	@Override
	public void create(BoardVO vo) {
		dao.create(vo);
	}

	@Override
	public BoardVO read() {
		return dao.read();
	}

	@Override
	public void update() {
		dao.update();
	}

	@Override
	public void delete() {
		dao.delete();
	}

}
