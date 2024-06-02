package com.example.spring01;



import com.example.spring01.Mapper.BoardMapper;
import com.example.spring01.Mapper.UserMapper;
import com.example.spring01.dto.BoardDto;
import com.example.spring01.dto.UserDto;
import com.example.spring01.service.BoardService;
import com.example.spring01.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class Spring01ApplicationTests {

    @Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;

    @Test
    public void userTest()
    {
        UserDto user = new UserDto();
        user.setId("test");
        user.setPsw("password");
        user.setName("name");
        user.setGender("male");
        user.setEmail("test@test.test");
        uMapper.insertUser(user);

        System.out.println(uMapper.selectOneUser("test"));
    }

    @Test
    public void boardTest() {
        BoardDto board = new BoardDto();
        board.setPsw("1234");
        board.setTitle("haoun blog");
        bMapper.insertBoard(board);
        System.out.println(bMapper.selectOneBoard(1));
    }

    @Autowired
    private UserService uService;
    @Autowired
    private BoardService bService;

    @Test
    public void userServiceTest()
    {
        UserDto user = new UserDto();
        user.setId("test2");
        user.setPsw("test2");
        user.setName("테스트2");
        user.setGender("남");
        user.setEmail("test2@test2.test");
        uService.join(user);
        System.out.println(uService.getUser("test2"));
        System.out.println("로그인 결과:"+uService.login("test2", "test2"));

    }
    @Test
    public void boardServiceTest() {
        BoardDto board = new BoardDto();
        board.setNum(1972);
        board.setPsw("9596");
        board.setContent("학식먹을까 배달먹을까");
        board.setTitle("고민");
        bService.write(board);

        for(BoardDto b : bService.getBoardList())
            System.out.println(b);
    }
    @Test
    void contextLoads() {
    }

}
