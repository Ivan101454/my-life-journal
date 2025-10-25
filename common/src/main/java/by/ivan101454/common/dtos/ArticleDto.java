package by.ivan101454.common.dtos;

import by.ivan101454.common.enums.Categories;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represent a DTO for Article entity
 * @param id UUID of the article
 * @param title name of the article
 * @param description the short description about article, for preview
 * @param content the main content
 * @param published the date of creating publication
 * @param author the name of author
 * @param category the category that article belongs to
 */
public record ArticleDto(
        UUID id, String title, String description, String content, LocalDateTime published, String author, Enum<Categories> category) {
}
