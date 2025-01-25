package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Qualifier("email")
public final class EmailCommentNotificationProxy implements CommentNotificationProxy {

    private final Logger logger = Logger.getLogger(EmailCommentNotificationProxy.class.getName());

    @Override
    public void sendComment(Comment comment) {
        logger.info("+ Отправка email для комментария: " +  comment.getText());
    }
}
