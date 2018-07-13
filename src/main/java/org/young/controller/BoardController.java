package org.young.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.young.domain.BaseVO;
import org.young.domain.BoardVO;
import org.young.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject 
	BoardService service;
	
	@GetMapping("/main")
	public void main() {
		logger.info("board main get");
	}
	
	@PostMapping("/main")
	public @ResponseBody Map<String, Object> mainPost(BaseVO vo) {
		logger.info("board main post");
		logger.info(vo.toString());
		
		int total = service.total();
		
		Map<String, Object> map = new HashMap<>();
		
		BaseVO bvo = new BaseVO(vo.getPage(), total);
		
		List<BoardVO> list = service.readAll(bvo);
		
		map.put("list", list);
		map.put("page", bvo);
		
		return map;
		
	}
	
	@GetMapping("/{bno}")
	public String read(Locale locale, Model model, @PathVariable("bno") Integer bno) {
		
		logger.info(bno+"");
		BoardVO vo = new BoardVO();
		vo.setBno(bno);
		model.addAttribute("one", service.read(vo));
		return "board/read";
	}
	
}
