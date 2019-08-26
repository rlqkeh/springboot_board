package com.example.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.board.dto.BoardDto;
import com.example.board.service.BoardService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardApplicationTests {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private BoardService boardService; 
	

	@Test
	public void contextLoads() {
	}
	

	@Test
	public void testSqlSession() throws Exception{
		System.out.println(sqlSession.toString());
	}
	
	@Test
	public void selectSql() throws Exception{
		System.out.println("------------Test-----------");
		List<BoardDto> list = boardService.selectBoardList();
		System.out.println(list.toString());
		
	}

}
