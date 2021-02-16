package articleCards.controller;

import articleCards.domain.MappedSuperClass.ArticleCard;
import articleCards.domain.MappedSuperClass.FacebookArticleCard;
import articleCards.domain.MappedSuperClass.VkArticleCard;
import articleCards.repository.MappedSuperClass.MSCArticleCardRepository;
import articleCards.repository.MappedSuperClass.MSCFacebookArticleCardRepository;
import articleCards.repository.MappedSuperClass.MSCVkArticleCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msc")
public class MSCController {

    @Autowired
    private MSCArticleCardRepository articleCardRepository;
    @Autowired
    private MSCFacebookArticleCardRepository fbArticleCardRepository;
    @Autowired
    private MSCVkArticleCardRepository vkArticleCardRepository;

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