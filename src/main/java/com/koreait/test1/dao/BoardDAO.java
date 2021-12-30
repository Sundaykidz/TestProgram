package com.koreait.test1.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.koreait.test1.dto.Board;
@Repository
public interface BoardDAO {

	public ArrayList<Board> selectBoardList();
	public int selectBoardCount();
	public int insertBoard(Map<String, Object> map);
	public Board selectByIdx(int idx);
	public int updateBoard(Map<String, Object> map);
	public int deleteBoard(int idx);
	
}
