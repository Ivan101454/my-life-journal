package by.ivan101454.web.client;

import by.ivan101454.common.dtos.ArticleDto;
import by.ivan101454.common.dtos.PayloadArticleDto;
import by.ivan101454.common.dtos.PayloadCommentDto;
import by.ivan101454.common.enums.Categories;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class RestClientArticlesClient implements ArticlesRestClient {

    private final static ParameterizedTypeReference<List<ArticleDto>> NEWS_TYPE_REFERENCE =
            new ParameterizedTypeReference<>() {
            };

    private final RestClient restClient;


    @Override
    public List<ArticleDto> findAllArticle() {
        return List.of();
    }

    @Override
    public List<ArticleDto> findArticleWithPagination(int pageNumber, int pageSize) {
        return List.of();
    }

    @Override
    public List<ArticleDto> findArticleByFilter(String filter, int pageNumber, int pageSize) {
        return List.of();
    }

    @Override
    public List<ArticleDto> findArticlesByCategory(Enum<Categories> category, int pageNumber, int pageSize) {
        return List.of();
    }

    @Override
    public PayloadArticleDto createArticle(PayloadArticleDto payload, Enum<Categories> category, MultipartFile[] images) {
        return null;
    }

    @Override
    public Optional<ArticleDto> findArticle(UUID articleId) {
        return Optional.empty();
    }

    @Override
    public void updateArticle(PayloadArticleDto payload, Enum<Categories> category, MultipartFile[] image) {

    }

    @Override
    public void deleteArticle(UUID articleId) {

    }

    @Override
    public List<ArticleDto> getComments(UUID articleId) {
        return List.of();
    }

    @Override
    public void addComment(UUID articleId, PayloadCommentDto comment) {

    }
}
