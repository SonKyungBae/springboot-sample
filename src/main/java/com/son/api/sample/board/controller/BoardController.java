package com.son.api.sample.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.son.api.sample.board.service.BoardService;
import com.son.domain.sample.board.BoardResVO;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list")
	public ResponseEntity<BoardResVO> list() {
		
		BoardResVO boardResVO = boardService.list();
		
		return new ResponseEntity<BoardResVO>(boardResVO, HttpStatus.OK);
	}
}
