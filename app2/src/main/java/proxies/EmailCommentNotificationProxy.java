package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправка уведомления для комментария: " +  comment.getText());
    }
}
