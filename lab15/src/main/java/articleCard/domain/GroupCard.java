package articleCard.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class GroupCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GroupCard")
    @SequenceGenerator(name = "GroupCard", sequenceName = "group_card_seq", allocationSize = 1)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToOne(cascade={CascadeType.ALL})
    private GroupCard parentGroupCard;

    @ManyToMany(cascade={CascadeType.ALL})
    private List<VkArticleCard> articleCards;

    public GroupCard() {
    }
}
