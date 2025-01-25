package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(annotations.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("<<<<< Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");

        Comment comment = new Comment();
        comment.setText("Welcome to Hell!");
        Object[] newArguments = { comment };

        Object returnedByMethod = joinPoint.proceed(newArguments);

        logger.info(">>>>> Method executed and returned " + returnedByMethod);

        returnedByMethod = "FAILED";

        return returnedByMethod;
    }

    @AfterReturning(value = "@annotation(annotations.ToLog)", returning = "returnedValue")
    public void logAnother(Object returnedValue) {
        logger.info("***888 Method executed and returned " + returnedValue);
    }
}
