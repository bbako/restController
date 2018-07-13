package org.young.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.young.domain.BaseVO;
import org.young.domain.BoardVO;
import org.young.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO dao;

	@Override
	public void create(BoardVO vo) {
		dao.create(vo);
	}

	@Override
	public BoardVO read(BoardVO vo) {
		return dao.read(vo);
	}

	@Override
	public void update(BoardVO vo) {
		dao.update(vo);
	}

	@Override
	public void delete(BoardVO vo) {
		dao.delete(vo);
	}

	@Override
	public List<BoardVO> readAll(BaseVO vo) {
		return dao.readAll(vo);
	}

	@Override
	public int total() {
		return dao.total();
	}


}
