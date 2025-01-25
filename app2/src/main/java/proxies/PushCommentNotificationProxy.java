package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Qualifier("push")
public final class PushCommentNotificationProxy implements CommentNotificationProxy {

    private final Logger logger = Logger.getLogger(PushCommentNotificationProxy.class.getName());

    @Override
    public void sendComment(Comment comment) {
        logger.info("+ Отправка push для комментария: " + comment.getText());
    }
}
