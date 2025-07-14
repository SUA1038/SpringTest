package org.mbc.controller;

import org.mbc.domain.BoardVO;
import org.mbc.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller 
@Log4j2
@RequestMapping("/board/*") 
@AllArgsConstructor
public class BoardController {
	
	private BoardService service ; 
	
	@GetMapping("/list") 
	public void list(Model model) {

		log.info("BoardController.list 메서드 실행......");
		
		model.addAttribute("list", service.getList());

	}
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("BoardController.register 메서드 실행......");
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		
		return "redirect:/board/list"; 
		
	}
	
	
}
