package articleCards.controller;

import articleCards.domain.TABLE_PER_CLASS.ArticleCard;
import articleCards.domain.TABLE_PER_CLASS.FacebookArticleCard;
import articleCards.domain.TABLE_PER_CLASS.VkArticleCard;
import articleCards.repository.TABLE_PER_CLASS.TpCArticleCardRepository;
import articleCards.repository.TABLE_PER_CLASS.TpCFacebookArticleCardRepository;
import articleCards.repository.TABLE_PER_CLASS.TpCVkArticleCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tpc")
public class TpCController {

    @Autowired
    private TpCArticleCardRepository articleCardRepository;
    @Autowired
    private TpCFacebookArticleCardRepository fbArticleCardRepository;
    @Autowired
    private TpCVkArticleCardRepository vkArticleCardRepository;

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