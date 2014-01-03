CREATE TABLE ref_volume_type
(
  id_volume_type serial NOT NULL, -- id типа
  short_name character varying, -- сокращенное название
  full_name character varying, -- полное название
  CONSTRAINT ref_volume_type_pkey PRIMARY KEY (id_volume_type )
)
WITH (
  OIDS=TRUE
);
ALTER TABLE ref_volume_type
  OWNER TO postgres;
COMMENT ON COLUMN ref_volume_type.id_volume_type IS 'id типа';
COMMENT ON COLUMN ref_volume_type.short_name IS 'сокращенное название';
COMMENT ON COLUMN ref_volume_type.full_name IS 'полное название';

