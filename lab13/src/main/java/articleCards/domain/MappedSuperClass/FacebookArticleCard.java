package articleCards.domain.MappedSuperClass;

import javax.persistence.Entity;

@Entity(name="msc_facebookArticleCard")
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
