package articleCards.controller;

import articleCards.domain.SINGLE_TABLE.ArticleCard;
import articleCards.domain.SINGLE_TABLE.FacebookArticleCard;
import articleCards.domain.SINGLE_TABLE.VkArticleCard;
import articleCards.repository.SINGLE_TABLE.STArticleCardRepository;
import articleCards.repository.SINGLE_TABLE.STFacebookArticleCardRepository;
import articleCards.repository.SINGLE_TABLE.STVkArticleCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/st")
public class StController {

    @Autowired
    private STArticleCardRepository articleCardRepository;
    @Autowired
    private STFacebookArticleCardRepository fbArticleCardRepository;
    @Autowired
    private STVkArticleCardRepository vkArticleCardRepository;

    @PostMapping(value = "/article-card")
    public ArticleCard createArticleCard(@RequestBody ArticleCard articleCard) {
        return articleCardRepository.save(articleCard);
    }

    @PostMapping(value = "/vk-article-card")
    public VkArticleCard createVkArticleCard(@RequestBody VkArticleCard articleCard) {
        return vkArticleCardRepository.save(articleCard);
    }

    @PostMapping(value = "/fb-article-card")
    public FacebookArticleCard createFbArticleCard(@RequestBody FacebookArticleCard articleCard) {
        return fbArticleCardRepository.save(articleCard);
    }

}