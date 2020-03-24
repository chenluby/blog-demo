package blog.demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.chen on 2020/3/24. 18:13
 */
@RestController
public class TestController {

    @GetMapping("getSwagger2")
    @ApiOperation("测试文档")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", required = true, dataType = "string"),
            @ApiImplicitParam(name = "age", value = "年龄", dataType = "int")
    })
    public String getSwagger2(String name, Integer age) {
        return "文档测试";
    }
}
