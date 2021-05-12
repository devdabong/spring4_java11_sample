package com.spring.demo.board.service;

import java.util.List;

import com.spring.demo.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectBoardList();
}
