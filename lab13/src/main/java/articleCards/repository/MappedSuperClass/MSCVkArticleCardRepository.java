package articleCards.repository.MappedSuperClass;

import articleCards.domain.MappedSuperClass.VkArticleCard;
import org.springframework.data.repository.CrudRepository;

public interface MSCVkArticleCardRepository extends CrudRepository<VkArticleCard, Long> {

}