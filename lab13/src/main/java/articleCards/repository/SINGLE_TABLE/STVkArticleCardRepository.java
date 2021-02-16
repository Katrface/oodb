package articleCards.repository.SINGLE_TABLE;

import articleCards.domain.SINGLE_TABLE.VkArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface STVkArticleCardRepository extends CrudRepository<VkArticleCard, Long> {

}