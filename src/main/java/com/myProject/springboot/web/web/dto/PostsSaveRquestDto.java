package com.myProject.springboot.web.web.dto;

import com.myProject.springboot.web.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRquestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRquestDto(String title, String content, String author){

        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
