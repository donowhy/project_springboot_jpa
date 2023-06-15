package project.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    private String title;
    private String content;
    private String author;


    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
