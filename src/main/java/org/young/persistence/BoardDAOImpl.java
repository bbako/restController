package org.young.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.young.domain.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	SqlSession sess;

	@Override
	public void create(BoardVO vo) {

	}

	@Override
	public BoardVO read() {
		return null;
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
