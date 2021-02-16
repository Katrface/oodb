package articleCards.controller;

import articleCards.domain.JOINED.*;
import articleCards.repository.JOINED.JArticleCardRepository;
import articleCards.repository.JOINED.JFacebookArticleCardRepository;
import articleCards.repository.JOINED.JVkArticleCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/joined")
public class JoinedController {

    @Autowired
    private JArticleCardRepository articleCardRepository;
    @Autowired
    private JFacebookArticleCardRepository fbArticleCardRepository;
    @Autowired
    private JVkArticleCardRepository vkArticleCardRepository;

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
