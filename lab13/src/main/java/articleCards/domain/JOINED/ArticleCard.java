package articleCards.domain.JOINED;

import javax.persistence.*;

import static javax.persistence.InheritanceType.JOINED;

@Entity(name = "j_articleCard")
@Inheritance(strategy = JOINED)
public class ArticleCard extends Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "j_articleCard")
    @SequenceGenerator(name = "j_articleCard", sequenceName = "j_articleCard_seq", allocationSize = 1)
    protected Long id;
    @Column
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
