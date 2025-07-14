package org.mbc.service;

import java.util.List;

import org.mbc.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board); 
	// 게시판 등록용 메서드
	
	
	public List<BoardVO> getList();

	
}
