package com.son.api.sample.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.son.api.sample.board.mapper.BoardMapper;
import com.son.api.sample.board.service.BoardService;
import com.son.domain.sample.board.BoardResVO;
import com.son.domain.sample.board.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public BoardResVO list() {
		// TODO Auto-generated method stub
		
		List<BoardVO> boardList = boardMapper.list();
		
		BoardResVO boardResVO = new BoardResVO();
		boardResVO.setBoard(boardList);
		
		return boardResVO;
	}

}
