package com.son.api.sample.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.son.domain.sample.board.BoardVO;

@Repository
public interface BoardMapper {
	public List<BoardVO> list();
}
