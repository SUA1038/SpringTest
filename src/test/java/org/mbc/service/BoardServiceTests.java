package org.mbc.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mbc.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class BoardServiceTests {

	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@Test
	public void testExist() {
		
		log.info("==========================");
		log.info(service);
		assertNotNull(service);
		log.info("==========================");
		
	}
	
	
	@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("서비스에서 만든 제목");
		board.setContent("서비스에서 만든 내용");
		board.setWriter("서비스님");
		
		service.register(board);
		
		log.info("======================");
		log.info("생성된 게시물의 번호 : " + board.getBno());
		log.info("======================");
	}
	
}
