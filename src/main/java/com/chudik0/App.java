package com.chudik0;

import com.chudik0.model.Post;
import com.chudik0.service.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PostService postService = context.getBean("postService", PostService.class);

        List<Post> posts = postService.getAllPosts();
        for (Post post : posts) {
            System.out.println(post);
        }

        System.out.println("Post with id  = 3:\t" + postService.getPostById(3));

        postService.deletePost(3);

        posts = postService.getAllPosts();
        for (Post post : posts) {
            System.out.println(post);
        }

        postService.updatePost(9, "-=new Title=-", "***new Content***");
        posts = postService.getAllPosts();
        for (Post post : posts) {
            System.out.println(post);
        }

        int idNewPost = postService.createPost("@newPost@", "-@new Content post@-");
        System.out.println("idNewPost = " + idNewPost);
        posts = postService.getAllPosts();
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
