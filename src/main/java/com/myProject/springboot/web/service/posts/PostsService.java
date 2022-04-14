package com.myProject.springboot.web.service.posts;

import com.myProject.springboot.web.domain.posts.PostsRepository;
import com.myProject.springboot.web.web.dto.PostsSaveRquestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRquestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
