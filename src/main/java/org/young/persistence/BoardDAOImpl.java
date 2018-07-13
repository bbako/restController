package org.young.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.young.domain.BaseVO;
import org.young.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	SqlSession sess;
	
	private String namespace = "BoardMapper";

	@Override
	public void create(BoardVO vo) {
		sess.insert(namespace+".create",vo);
	}

	@Override
	public BoardVO read(BoardVO vo) {
		return sess.selectOne(namespace+".read", vo);
	}

	@Override
	public void update(BoardVO vo) {
		sess.update(namespace+".update",vo);
	}

	@Override
	public void delete(BoardVO vo) {
		sess.update(namespace+".delete",vo);
	}

	@Override
	public List<BoardVO> readAll(BaseVO vo) {
		return sess.selectList(namespace+".readAll",vo);
	}

	@Override
	public int total() {
		return sess.selectOne(namespace+".total");
	}

}
