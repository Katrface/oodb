package articleCards.repository.TABLE_PER_CLASS;

import articleCards.domain.TABLE_PER_CLASS.ArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface TpCArticleCardRepository extends CrudRepository<ArticleCard, Long> {

}