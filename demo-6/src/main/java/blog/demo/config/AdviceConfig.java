package blog.demo.config;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * 全局控制器
 *
 * @author Mr.chen on 2020/3/24. 15:43
 */
@RestControllerAdvice
public class AdviceConfig {
    /**
     * @param e        异常捕抓
     * @param response http响应
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandle(Exception e, HttpServletResponse response) {
        String message;
        //参数校验异常处理
        if (e instanceof BindingResult) {
            BindingResult bindingResult = (BindingResult) e;
            if (bindingResult.hasErrors()) {
                //自定义响应码
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                message = bindingResult.getFieldError().getDefaultMessage();
                String responseMessage = "{code:\"-1\",message:\"" + message + "\"}";
                return responseMessage;
            }
        }
        e.printStackTrace();
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        message = "未知错误";
        String responseMessage = "{code:\"-1\",message:\"" + message + "\"}";
        return responseMessage;
    }
}
