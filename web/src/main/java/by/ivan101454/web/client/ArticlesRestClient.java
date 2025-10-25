package by.ivan101454.web.client;

import by.ivan101454.common.dtos.ArticleDto;
import by.ivan101454.common.dtos.PayloadArticleDto;
import by.ivan101454.common.dtos.PayloadCommentDto;
import by.ivan101454.common.enums.Categories;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * REST client interface for managing articles and comments.
 * <p>
 * Provides methods for retrieving, creating, updating, and deleting articles,
 * also gives creating and reading comments
 */
public interface ArticlesRestClient {

    List<ArticleDto> findAllArticle();
    List<ArticleDto> findArticleWithPagination(int pageNumber, int pageSize);
    List<ArticleDto> findArticleByFilter(String filter, int pageNumber, int pageSize);
    List<ArticleDto> findArticlesByCategory(Enum<Categories> category, int pageNumber, int pageSize);
    PayloadArticleDto createArticle(PayloadArticleDto payload, Enum<Categories> category, MultipartFile[] images);
    Optional<ArticleDto> findArticle(UUID articleId);
    void updateArticle(PayloadArticleDto payload, Enum<Categories> category, MultipartFile[] image);
    void deleteArticle(UUID articleId);
    List<ArticleDto> getComments(UUID articleId);
    void addComment(UUID articleId, PayloadCommentDto comment);
}
