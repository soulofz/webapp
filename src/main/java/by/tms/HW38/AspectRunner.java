package by.tms.HW38;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Aspect
@Component
public class AspectRunner {
    @Pointcut("within(by.tms.HW38.UserRepository)")
    public void pointcutBeforeMethod(){
    }

    @Before(value = "@annotation(by.tms.HW38.ShowWorkTime)")
    public void before(JoinPoint joinPoint){
        System.out.println("Aspect Before Method");
    }

    @After(value = "@annotation(by.tms.HW38.ShowWorkTime)")
    public void after(JoinPoint joinPoint){
        System.out.println("Aspect After Method");
    }

    @AfterReturning(value = "@annotation(by.tms.HW38.ShowWorkTime)", returning = "value")
    public void afterReturningMethod(Object value) {
        System.out.println("Aspect logic After Returning: " + value);
    }

    @AfterThrowing(value = "@annotation(by.tms.HW38.ShowWorkTime)", throwing = "e")
    public void afterThrowingMethod(Exception e) {
        System.out.println("Aspect After Throwing: " + e.getMessage());
    }

    @Around(value = "@annotation(by.tms.HW38.ShowWorkTime)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Timestamp start = Timestamp.valueOf(LocalDateTime.now());
        joinPoint.proceed();
        Timestamp end = Timestamp.valueOf(LocalDateTime.now());
        System.out.println("Work time of method: " + joinPoint.getSignature().getName() + ": " + (end.getTime() - start.getTime() + "ms"));
    }

}
