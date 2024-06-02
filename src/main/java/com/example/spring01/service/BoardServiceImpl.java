package com.example.spring01.service;

import com.example.spring01.Mapper.BoardMapper;
import com.example.spring01.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper bMapper;


    @Override
    public void write(BoardDto board) {
        bMapper.insertBoard(board);
    }

    @Override
    public void modify(BoardDto board) {
        bMapper.updateBoard(board);
    }

    @Override
    public void remove(int num) {
        bMapper.deleteBoard(num);
    }

    @Override
    public BoardDto getBoard(int num) {
        return bMapper.selectOneBoard(num);
    }

    @Override
    public List<BoardDto> getBoardList() {
        return bMapper.selectAllBoard();
    }

    @Override
    public List<BoardDto> getBoardSearchList(HashMap<String, Object> params) {
        return null;
    }
}
