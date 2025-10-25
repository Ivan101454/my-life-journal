package by.ivan101454.common.dtos;

import by.ivan101454.common.enums.Categories;

import java.time.LocalDateTime;
import java.util.UUID;

public record ArticleDto(
        UUID id, String title, String description, String content, LocalDateTime published, String author, Enum<Categories> category) {
}
