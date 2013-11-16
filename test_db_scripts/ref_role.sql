-- Table: ref_role

-- DROP TABLE ref_role;

CREATE TABLE ref_role
(
  id_role integer NOT NULL DEFAULT nextval('role_id_seq'::regclass),
  name character varying,
  CONSTRAINT role_pkey PRIMARY KEY (id_role )
)
WITH (
  OIDS=TRUE
);
ALTER TABLE ref_role
  OWNER TO postgres;
