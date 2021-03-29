package articleCards.repository.JOINED;

import articleCards.domain.JOINED.FacebookArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface JFacebookArticleCardRepository extends CrudRepository<FacebookArticleCard, Long> {
}