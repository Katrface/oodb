package articleCards.domain.SINGLE_TABLE;

import javax.persistence.Entity;

@Entity(name="st_facebookArticleCard")
public class FacebookArticleCard extends ArticleCard {
    private String linkFacebook;

    public FacebookArticleCard() {
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }
}
