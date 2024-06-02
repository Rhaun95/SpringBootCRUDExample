package com.example.spring01.service;

import com.example.spring01.dto.BoardDto;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
    public void write(BoardDto board);
    public void modify(BoardDto board);
    public void remove(int num);
    public BoardDto getBoard(int num);
    public List<BoardDto> getBoardList();
    public List<BoardDto> getBoardSearchList(HashMap<String, Object> params);
}
