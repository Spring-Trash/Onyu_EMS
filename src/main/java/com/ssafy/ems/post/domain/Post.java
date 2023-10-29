package com.ssafy.ems.post.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    private UUID postId;
    private int id;
    private String userId;
    private String title;
    private String content;
}
