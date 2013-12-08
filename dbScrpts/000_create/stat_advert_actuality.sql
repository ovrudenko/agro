-- Table: stat_advert_actuality

-- DROP TABLE stat_advert_actuality;

CREATE TABLE stat_advert_actuality
(
  id_adv_actuality serial NOT NULL,
  id_advert integer, -- ссылка на сообщение
  start_date timestamp with time zone, -- дата начала
  stop_date timestamp with time zone, -- дата завершения
  id_actual integer,
  is_delete boolean,
  CONSTRAINT stat_advert_actuality_pkey PRIMARY KEY (id_adv_actuality ),
  CONSTRAINT stat_advert_actuality_id_actual_fkey FOREIGN KEY (id_actual)
      REFERENCES ref_actual (id_actual) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT stat_advert_actuality_id_advert_fkey FOREIGN KEY (id_advert)
      REFERENCES advert (id_advert) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE stat_advert_actuality
  OWNER TO postgres;
COMMENT ON COLUMN stat_advert_actuality.id_advert IS 'ссылка на сообщение';
COMMENT ON COLUMN stat_advert_actuality.start_date IS 'дата начала';
COMMENT ON COLUMN stat_advert_actuality.stop_date IS 'дата завершения';

