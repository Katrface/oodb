package articleCards.domain.SINGLE_TABLE;

import javax.persistence.Entity;

@Entity(name = "st_vkArticleCard")
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
