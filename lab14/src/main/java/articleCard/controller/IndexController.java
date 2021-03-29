package articleCard.controller;

import articleCard.domain.VkArticleCard;
import articleCard.repository.VkArticleCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private VkArticleCardRepository repository;

    @GetMapping(value = "/article-card")
    @ResponseBody
    public List<VkArticleCard> getBanks() {
        return repository.getArticleCards();
    }
}
