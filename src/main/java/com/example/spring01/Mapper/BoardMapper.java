package com.example.spring01.Mapper;


import com.example.spring01.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BoardMapper {
    public void insertBoard(BoardDto board);
    public void updateBoard(BoardDto board);
    public void deleteBoard(int num);
    public BoardDto selectOneBoard(int num);
    public List<BoardDto> selectAllBoard();
    public List<BoardDto> selectSearchBoard(HashMap<String, Object> params);
}
