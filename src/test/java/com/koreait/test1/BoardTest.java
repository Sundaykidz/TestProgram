package com.koreait.test1;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.koreait.test1.config.BeanConfig;
import com.koreait.test1.dao.BoardDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {BeanConfig.class})
public class BoardTest {
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Test
	public void insertTest() {
		
		
		
		Map<String, String> map;
		
		String writer = "테스터";
		String title = "테스트제목";
		String content = "테스트내용";
		
		map.put("wirter", writer);
		map.put("content", title);
		map.put("title", content);
		
		
		
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
		int result = boardDAO.insertBoard(map);
		
	
	}
	
	@Test
	public void selectTest() {
		
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
		
		
	
	
	}
	
	@Test
	public void updateTest() {
		
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
	
	
	}

	
	@Test
	public void deleteTest() {
		
		BoardDAO boardDAO = sqlSession.getMapper(BoardDAO.class);
	
	
	}
}
