CREATE SEQUENCE advert_type_id_adv_type_seq;
CREATE TABLE ref_advert_type
(
  id_adv_type integer NOT NULL DEFAULT nextval('advert_type_id_adv_type_seq'), -- id типа сообщения
  name character varying, -- название типа
  CONSTRAINT advert_type_pkey PRIMARY KEY (id_adv_type )
)
WITH (
  OIDS=TRUE
);
ALTER SEQUENCE advert_type_id_adv_type_seq OWNED BY ref_advert_type.id_adv_type;
ALTER TABLE ref_advert_type
 OWNER TO postgres;
COMMENT ON COLUMN ref_advert_type.id_adv_type IS 'id типа сообщения';
COMMENT ON COLUMN ref_advert_type.name IS 'название типа';
