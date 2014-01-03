CREATE TABLE ref_smtp_address
(
  domain_name text,
  smtp_server_name text,
  id_ref_smtp_address serial NOT NULL,
  CONSTRAINT ref_smtp_address_pkey PRIMARY KEY (id_ref_smtp_address )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ref_smtp_address
  OWNER TO postgres;
COMMENT ON TABLE ref_smtp_address
  IS 'Справочник email доменов и smtp серверов';
