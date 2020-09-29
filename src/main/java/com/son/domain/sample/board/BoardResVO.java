package com.son.domain.sample.board;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BoardResVO {

	private List<BoardVO> board;
	
	public BoardResVO() {
		board = new ArrayList<BoardVO>();
	}
	
}
