package com.spring.demo.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.board.dao.BoardDAO;
import com.spring.demo.board.service.BoardService;
import com.spring.demo.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO boardDAO; 

	@Override
	public List<BoardVO> selectBoardList() {
		return boardDAO.selectBoardList();
	}
	
	
}
