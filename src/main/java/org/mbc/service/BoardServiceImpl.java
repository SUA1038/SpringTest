package org.mbc.service;

import java.util.List;

import org.mbc.domain.BoardVO;
import org.mbc.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service 
@AllArgsConstructor 
@Log4j2 
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper ; 
	
	@Override
	public void register(BoardVO board) {
		
		log.info("BoardServiceImpl.register메서드 실행.....");
		
		mapper.insertSelectKey(board);
		log.info("정상등록 후 리스트 출력테스트......");
		mapper.getList2();
	}

	@Override
	public List<BoardVO> getList() {
	log.info("BoardServiceImpl.getList 메서드 실행.....");
		
		return mapper.getList2();
	}
	

}
