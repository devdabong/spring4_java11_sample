package com.spring.demo.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.demo.board.service.BoardService;
import com.spring.demo.board.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) {
		
		List<BoardVO> list = boardService.selectBoardList();
		
		System.out.println(list.toString());
		
		model.addAttribute("boardList", list);
		
		return "board";
	}
}
