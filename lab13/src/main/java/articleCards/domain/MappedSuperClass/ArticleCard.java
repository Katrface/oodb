package articleCards.domain.MappedSuperClass;

import javax.persistence.*;

import static javax.persistence.InheritanceType.JOINED;

@MappedSuperclass()
@Table(name = "msc_articleCard")
public class ArticleCard extends Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "msc_articleCard")
    @SequenceGenerator(name = "msc_articleCard", sequenceName = "msc_articleCard_seq", allocationSize = 1)
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
