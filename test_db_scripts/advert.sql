-- Table: advert

-- DROP TABLE advert;

CREATE TABLE advert
(
  id_advert serial NOT NULL, -- id объявления
  id_advert_type integer, -- тип сообщения
  id_user integer, -- ссылка на пользователя
  id_organization integer, -- ссылка на организацию
  text text, -- текст сообщения
  id_product integer, -- ссылка на название продукта
  date_create timestamp with time zone, -- дата создания объявления
  is_delete boolean,
  id_area integer,
  CONSTRAINT advert_pkey PRIMARY KEY (id_advert ),
  CONSTRAINT advert_id_advert_type_fkey FOREIGN KEY (id_advert_type)
      REFERENCES ref_advert_type (id_adv_type) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT advert_id_area_fkey FOREIGN KEY (id_area)
      REFERENCES ref_area (id_area) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT advert_id_organization_fkey FOREIGN KEY (id_organization)
      REFERENCES organization (id_organization) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT advert_id_product_fkey FOREIGN KEY (id_product)
      REFERENCES ref_product (id_product) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT advert_id_user_fkey FOREIGN KEY (id_user)
      REFERENCES customer (id_customer) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE advert
  OWNER TO postgres;
COMMENT ON COLUMN advert.id_advert IS 'id объявления';
COMMENT ON COLUMN advert.id_advert_type IS 'тип сообщения';
COMMENT ON COLUMN advert.id_user IS 'ссылка на пользователя';
COMMENT ON COLUMN advert.id_organization IS 'ссылка на организацию';
COMMENT ON COLUMN advert.text IS 'текст сообщения';
COMMENT ON COLUMN advert.id_product IS 'ссылка на название продукта';
COMMENT ON COLUMN advert.date_create IS 'дата создания объявления';

