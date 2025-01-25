package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public final class DBCommentRepository implements CommentRepository {

    private final Logger logger = Logger.getLogger(DBCommentRepository.class.getName());

    @Override
    public void storeComment(Comment comment) {
        logger.info("+ Сохранение комментария в БД: " + comment.getText());
    }
}
