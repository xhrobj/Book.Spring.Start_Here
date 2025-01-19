package repositories;

import model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Сохранение комментария в БД: " + comment.getText());
    }
}
