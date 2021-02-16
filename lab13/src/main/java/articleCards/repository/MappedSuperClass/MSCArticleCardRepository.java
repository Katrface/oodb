package articleCards.repository.MappedSuperClass;

import articleCards.domain.MappedSuperClass.ArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface MSCArticleCardRepository extends CrudRepository<ArticleCard, Long> {

}