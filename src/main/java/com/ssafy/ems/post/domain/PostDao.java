package com.ssafy.ems.post.domain;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.UUID;

@Mapper
public interface PostDao {
    @Select("select postId,userId,title,content from post")
    public List<Post> getPostList();

    @Select("select userId,title,content from post where postId = #{postId}")
    public List<Post> getPostByPostId(UUID postId);

    @Select("select userId,title,content from post where userId = #{userId}")
    public List<Post> getPostByUserId(String userId);

    @Insert("insert into post userId,title,content values (userId,title,content,values)")
    public int insertPost(Post post);

    @Delete("delete from post where postId = #{postId}")
    public int deletePost(String postId);
}
