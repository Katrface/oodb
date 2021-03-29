create sequence group_card_seq start 1 increment 1;
create sequence vkArticleCard_seq start 1 increment 1;

create table GroupCard (
    id int8 not null,
    description varchar(255),
    name varchar(255),
    parentGroupCard_id int8,
    primary key (id)
);
create table GroupCard_VkArticleCard (
    GroupCard_id int8 not null,
    articleCards_id int8 not null
);
create table VkArticleCard (
    id int8 not null,
    articleUrl varchar(255),
    name varchar(255),
    primary key (id)
);

alter table GroupCard add constraint FKaw7v6emph7010yxt3x3b4nlhm foreign key (parentGroupCard_id) references GroupCard;
alter table GroupCard_VkArticleCard add constraint FK57v1wjv7ftfm1yi99xovpt06e foreign key (articleCards_id) references VkArticleCard;
alter table GroupCard_VkArticleCard add constraint FK8xi99o3thv2s85hgua9xf1l50 foreign key (GroupCard_id) references GroupCard;