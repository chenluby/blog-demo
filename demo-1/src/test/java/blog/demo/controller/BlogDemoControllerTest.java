package blog.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Mr.chen on 2020/3/20. 17:17
 */
@SpringBootTest
public class BlogDemoControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * 测试查询数据
     *
     * @throws Exception
     */
    @Test
    void getList() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/getList"));
        resultActions.andReturn().getResponse().setCharacterEncoding("UTF-8");
        resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk());
    }
}