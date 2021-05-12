package com.spring.demo.board.dao;

import java.util.List;

import com.spring.demo.board.vo.BoardVO;

public interface BoardDAO {
	
	List<BoardVO> selectBoardList();
}
