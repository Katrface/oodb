package articleCard.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Foo")
    @SequenceGenerator(name = "Foo", sequenceName = "foo_seq", allocationSize = 1)
    private Long id;

    @OneToOne(cascade={CascadeType.ALL})
    private GroupCard groupCard;

    @OneToMany(cascade={CascadeType.ALL})
    private List<VkArticleCard> articleCard;

    public Foo() {
    }
}

/*
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE}).

    Использование этих значений определяет каскадное поведение на различных операциях:

    CascadeType.PERSIST — выполняется каскадное сохранение связанных объектов.
    CascadeType.MERGE — выполняется каскадное обновление.
    CascadeType.REFRESH — выполняется каскадное присоединение сущности к менеджеру сущностей.
    CascadeType.REMOVE — выполняется каскадное удаление.
    CascadeType.DETACH — выполняется каскадное отсоединение объектов от менеджера сущностей.
    CascadeType.ALL— все перечисленные выше операции выполняются каскадно.
 */
