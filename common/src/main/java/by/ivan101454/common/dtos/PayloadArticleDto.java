package by.ivan101454.common.dtos;

import by.ivan101454.common.enums.Categories;

public record PayloadArticleDto(
        String title, String description, String content, String author, Enum<Categories> category
) {
}
