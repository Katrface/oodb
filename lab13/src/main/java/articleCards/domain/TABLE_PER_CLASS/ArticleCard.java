package articleCards.domain.TABLE_PER_CLASS;

import javax.persistence.*;

import static javax.persistence.InheritanceType.JOINED;

@Entity(name = "TpC_articleCard")
@Inheritance(strategy = JOINED)
public class ArticleCard extends Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TpC_articleCard")
    @SequenceGenerator(name = "TpC_articleCard", sequenceName = "TpC_articleCard_seq", allocationSize = 1)
    protected Long id;
    protected String name;

    public ArticleCard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
