package articleCards.domain.SINGLE_TABLE;

import javax.persistence.*;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Entity(name = "st_articleCard")
@Inheritance(strategy = SINGLE_TABLE)
public class ArticleCard extends Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "st_articleCard")
    @SequenceGenerator(name = "st_articleCard", sequenceName = "st_articleCard_seq", allocationSize = 1)
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
