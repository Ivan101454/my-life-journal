package by.ivan101454.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/articles")
public class ArticlesController {

    @GetMapping
    public String getArticlesList() {
        return "catalogue/articles/index";
    }

}
