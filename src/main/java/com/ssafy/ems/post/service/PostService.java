package com.ssafy.ems.post.service;

import com.ssafy.ems.post.domain.Post;
import com.ssafy.ems.post.domain.dto.ModifyPost;
import com.ssafy.ems.post.domain.dto.WritePost;

import java.util.List;

public interface PostService {
    List<Post> postListByUser(String userId);
    Post postByPostId(String postId);
    boolean createPost(WritePost post);
    boolean deletePost(String postId);
    boolean updatePost(ModifyPost post);
}
