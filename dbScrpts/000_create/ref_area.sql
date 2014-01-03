CREATE SEQUENCE area_id_area_seq;
CREATE TABLE ref_area
(
  id_area integer NOT NULL DEFAULT nextval('area_id_area_seq'), -- Регион
  name character varying, -- название региона
  CONSTRAINT area_pkey PRIMARY KEY (id_area )
)
WITH (
  OIDS=TRUE
);
ALTER SEQUENCE area_id_area_seq OWNED BY ref_area.id_area;
ALTER TABLE ref_area
  OWNER TO postgres;
COMMENT ON COLUMN ref_area.id_area IS 'Регион';
COMMENT ON COLUMN ref_area.name IS 'название региона';

