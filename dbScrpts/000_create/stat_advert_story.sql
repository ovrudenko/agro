-- Table: stat_advert_story

-- DROP TABLE stat_advert_story;

CREATE TABLE stat_advert_story
(
  id_adv_story integer NOT NULL DEFAULT nextval('advert_story_id_adv_story_seq'::regclass), -- id истории сообщения
  id_advert integer NOT NULL, -- ссылка на сообщение
  date timestamp with time zone, -- дата записи
  min_price money, -- минимальная цена
  max_price money, -- максимальная цена
  min_volume double precision, -- минимальный объем
  max_volume double precision, -- максимальный объем
  id_volume_type integer, -- значение объема
  is_delete boolean,
  CONSTRAINT advert_story_pkey PRIMARY KEY (id_adv_story ),
  CONSTRAINT stat_advert_story_id_advert_fkey FOREIGN KEY (id_advert)
      REFERENCES advert (id_advert) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT stat_advert_story_id_volume_type_fkey FOREIGN KEY (id_volume_type)
      REFERENCES ref_volume_type (id_volume_type) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE stat_advert_story
  OWNER TO postgres;
COMMENT ON COLUMN stat_advert_story.id_adv_story IS 'id истории сообщения';
COMMENT ON COLUMN stat_advert_story.id_advert IS 'ссылка на сообщение';
COMMENT ON COLUMN stat_advert_story.date IS 'дата записи';
COMMENT ON COLUMN stat_advert_story.min_price IS 'минимальная цена';
COMMENT ON COLUMN stat_advert_story.max_price IS 'максимальная цена';
COMMENT ON COLUMN stat_advert_story.min_volume IS 'минимальный объем';
COMMENT ON COLUMN stat_advert_story.max_volume IS 'максимальный объем';
COMMENT ON COLUMN stat_advert_story.id_volume_type IS 'значение объема';

