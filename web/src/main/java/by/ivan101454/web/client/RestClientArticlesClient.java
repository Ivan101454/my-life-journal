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

/**
 * RestClientArticlesClient class implements ArticlesRestClient interface. It uses RestClient for request
 * in mostly itself methods.
 */
@RequiredArgsConstructor
public class RestClientArticlesClient implements ArticlesRestClient {

    private final static ParameterizedTypeReference<List<ArticleDto>> ARTICLES_TYPE_REFERENCE =
            new ParameterizedTypeReference<>() {
            };

    private final RestClient restClient;

    /**
     * Retrieves the list of article from the external catalogue-api
     * This method sends a GET request to the endpoint {@code /catalogue-api/articles/list}
     * and parse response in JSON format in list {@code ArticleDto} objects
     * @return a {@code List<ArticleDto>} containing all available ArticleDto objects
     */
    @Override
    public List<ArticleDto> findAllArticle() {
        return restClient
                .get()
                .uri("/catalogue-api/articles/list")
                .retrieve()
                .body(ARTICLES_TYPE_REFERENCE);
    }

    /**
     * Retrieve a pagination list ArticleDto objects from the external catalogue-api
     * This method sends a GET request to the endpoint {@code /catalogue-api/articles/list}
     * with parameters pageNumber and pageSize
     * and parse response in JSON format in list {@code ArticleDto} objects
     * @param pageNumber number os required page
     * @param pageSize number required elements on every page
     * @return a {@code List<ArticleDto>} containing ArticleDto objects for the requested page
     */
    @Override
    public List<ArticleDto> findArticleWithPagination(int pageNumber, int pageSize) {
        return restClient
                .get()
                .uri("/catalogue-api/articles/list?pageNumber={pageNumber}&pageSize={pageSize}", pageNumber, pageSize)
                .retrieve()
                .body(ARTICLES_TYPE_REFERENCE);
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
