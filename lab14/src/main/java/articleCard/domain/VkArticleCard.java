package articleCard.domain;

import javax.persistence.*;

@Entity
public class VkArticleCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VkArticleCard")
    @SequenceGenerator(name = "VkArticleCard", sequenceName = "vkArticleCard_seq", allocationSize = 1)
    private Long id;
    @Column
    private String name;
    @Column
    private String articleUrl;

    public VkArticleCard() {
    }
}
