CREATE TABLE organization
(
  id_organization serial NOT NULL,
  short_name_org character varying, -- Сокращенное название организации
  full_name_org character varying, -- Полное название организации
  id_area integer, -- ссылка на регион
  CONSTRAINT organization_pkey PRIMARY KEY (id_organization ),
  CONSTRAINT organization_id_area_fkey FOREIGN KEY (id_area)
      REFERENCES ref_area (id_area) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE organization
  OWNER TO postgres;
COMMENT ON TABLE organization
  IS 'Организация';
COMMENT ON COLUMN organization.short_name_org IS 'Сокращенное название организации';
COMMENT ON COLUMN organization.full_name_org IS 'Полное название организации';
COMMENT ON COLUMN organization.id_area IS 'ссылка на регион';

