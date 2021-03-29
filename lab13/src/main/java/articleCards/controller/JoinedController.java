package articleCards.controller;

import articleCards.domain.JOINED.ArticleCard;
import articleCards.domain.JOINED.FacebookArticleCard;
import articleCards.domain.JOINED.VkArticleCard;
import articleCards.repository.JOINED.JArticleCardRepository;
import articleCards.repository.JOINED.JFacebookArticleCardRepository;
import articleCards.repository.JOINED.JVkArticleCardRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joined")
public class JoinedController {

    private final JArticleCardRepository articleCardRepository;
    private final JFacebookArticleCardRepository fbArticleCardRepository;
    private final JVkArticleCardRepository vkArticleCardRepository;

    public JoinedController(JArticleCardRepository articleCardRepository, JFacebookArticleCardRepository fbArticleCardRepository, JVkArticleCardRepository vkArticleCardRepository) {
        this.articleCardRepository = articleCardRepository;
        this.fbArticleCardRepository = fbArticleCardRepository;
        this.vkArticleCardRepository = vkArticleCardRepository;
    }


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
