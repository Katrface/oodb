package articleCards.repository.MappedSuperClass;

import articleCards.domain.MappedSuperClass.FacebookArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface MSCFacebookArticleCardRepository extends CrudRepository<FacebookArticleCard, Long> {

}