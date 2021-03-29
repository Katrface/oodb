package articleCard.repository;

import articleCard.domain.VkArticleCard;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class VkArticleCardRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<VkArticleCard> getArticleCards() {
        return null;
//        return entityManager.createQuery("select b from Bank b").getResultList();
    }


}
