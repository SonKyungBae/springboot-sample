package com.son.api.sample.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.son.domain.sample.board.BoardResVO;

@RestController
@RequestMapping("/board")
public class BoardController {

	
	@RequestMapping("/list")
	public ResponseEntity<BoardResVO> list() {
		
		
		
		
		return "";
	}
}
