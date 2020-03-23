package blog.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Aop切面类
 *
 * @author Mr.chen on 2020/3/23. 16:57
 * @see {https://www.xncoding.com/2017/07/24/spring/sb-aop.html}
 */
@Component
@Aspect
@Slf4j
public class DemoAspect {

    /**
     * 切入点声明，第一个*表示任意返回值，第二个*表示controller任意类，第三个*任意方法
     */
    @Pointcut("execution(public * blog.demo.controller.*.*(..))")
    public void aopDemo() {
    }

    /**
     * 前置通知, 在方法执行之前执行
     *
     * @param joinPoint
     */
    @Before("aopDemo()")
    public void doBefore(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info("前置通知>>>>");
        // 记录下请求内容
        log.info("请求地址:{}", request.getRequestURL().toString());
        log.info("请求方法:{}", request.getMethod());
        log.info("ip:{}", request.getRemoteAddr());
        log.info("类方法:{}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("参数连接点:{}", Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 后置通知, 在方法执行之后执行
     *
     * @param joinPoint
     */
    @After("aopDemo()")
    public void doAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        log.info("后置通知>>>>{}", methodName);
    }

    /**
     * 返回通知, 在方法返回结果之后执行
     *
     * @param joinPoint
     * @param result    在返回通知方法中可以从result变量中获取连接点方法的返回结果了
     */
    @AfterReturning(value = "aopDemo()",
            returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        log.info("返回通知>>>>连接点方法为：{},参数为：{},目标方法执行结果为：{}", methodName, args, result);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing(pointcut = "aopDemo()", throwing = "ex")
    public void doAfterThrowing(JoinPoint joinPoint, RuntimeException ex) {
        String methodName = joinPoint.getSignature().getName();
        log.info("后置异常通知>>>>方法名：{},异常信息:{}", methodName, ex.getLocalizedMessage());
    }

    /**
     * 环绕通知, 围绕着方法执行
     *
     * @param pjp
     * @param userAccess 自定义注解
     * @return
     */
    @Around("@annotation(userAccess)")
    public Object doAround(ProceedingJoinPoint pjp, UserAccess userAccess) {
        //获取注解里的值
        log.info("环绕通知>>>>围绕着方法执行通知{}", userAccess.desc());
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
