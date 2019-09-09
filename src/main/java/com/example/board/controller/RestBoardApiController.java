package com.example.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;
import com.example.comn.model.ResponseCode;
import com.example.comn.model.ResponseFactory;
import com.example.comn.model.ResponseList;
import com.example.comn.model.ResponseSingle;

@RestController
public class RestBoardApiController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/api/board", method=RequestMethod.GET)
	public ResponseList<BoardDto> openBoardList() throws Exception{
		return ResponseFactory.getResponseList(boardService.selectBoardList());
	}
	
	@RequestMapping(value="/api/board/write", method=RequestMethod.POST)
	public ResponseCode insertBoard(@RequestBody BoardDto board) throws Exception{
		boardService.insertBoard(board);
		return ResponseFactory.getResponseCode(200);
	}
	
	@RequestMapping(value="/api/board/{boardIdx}", method=RequestMethod.GET)
	public ResponseSingle openBoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception{
		return ResponseFactory.getResponseSingle(boardService.selectBoardDetail(boardIdx));
	}
	
	@RequestMapping(value="/api/board/{boardIdx}", method=RequestMethod.PUT)
	public ResponseCode updateBoard(@RequestBody BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return ResponseFactory.getResponseCode(200);
	}
	@RequestMapping(value="/api/board/{boardIdx}", method=RequestMethod.DELETE)
	public ResponseCode ResponseCode(@PathVariable("boardIdx") int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return ResponseFactory.getResponseCode(200);
	
	}

}
