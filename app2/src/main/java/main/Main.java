package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Koko");
        comment.setText("Hello, World)");

        commentService.publishComment(comment);
    }
}
