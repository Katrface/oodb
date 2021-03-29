package articleCard.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Foo")
    @SequenceGenerator(name = "Foo", sequenceName = "foo_seq", allocationSize = 1)
    private Long id;

    @OneToOne
    private GroupCard groupCard;

    @OneToMany
    private List<VkArticleCard> articleCard;

    public Foo() {
    }
}
