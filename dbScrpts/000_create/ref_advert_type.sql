-- Table: ref_advert_type

-- DROP TABLE ref_advert_type;

CREATE TABLE ref_advert_type
(
  id_adv_type integer NOT NULL DEFAULT nextval('advert_type_id_adv_type_seq'::regclass), -- id типа сообщения
  name character varying, -- название типа
  CONSTRAINT advert_type_pkey PRIMARY KEY (id_adv_type )
)
WITH (
  OIDS=TRUE
);
ALTER TABLE ref_advert_type
  OWNER TO postgres;
COMMENT ON COLUMN ref_advert_type.id_adv_type IS 'id типа сообщения';
COMMENT ON COLUMN ref_advert_type.name IS 'название типа';

