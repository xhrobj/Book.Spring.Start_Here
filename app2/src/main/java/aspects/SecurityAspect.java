package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(10)
public class SecurityAspect {

    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(annotations.ToLog)")
    public void secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("&&& <<< Security Aspect: Calling the intercepted method");

        joinPoint.proceed();

        logger.info("&&& >>>");
    }
}
