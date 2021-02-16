package articleCards.domain.MappedSuperClass;

import javax.persistence.Entity;

@Entity(name = "msc_vkArticleCard")
public class VkArticleCard extends ArticleCard {
    private String linkVk;

    public VkArticleCard() {
    }

    public String getLinkVk() {
        return linkVk;
    }

    public void setLinkVk(String linkVk) {
        this.linkVk = linkVk;
    }
}
