package articleCards.domain.JOINED;

import javax.persistence.Entity;

@Entity(name="j_facebookArticleCard")
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
