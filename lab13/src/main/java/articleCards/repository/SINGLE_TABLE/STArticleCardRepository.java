package articleCards.repository.SINGLE_TABLE;

import articleCards.domain.SINGLE_TABLE.ArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface STArticleCardRepository extends CrudRepository<ArticleCard, Long> {

}
