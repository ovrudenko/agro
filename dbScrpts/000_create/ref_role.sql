CREATE SEQUENCE role_id_seq;
CREATE TABLE ref_role
(
  id_role integer NOT NULL DEFAULT nextval('role_id_seq'),
  name character varying,
  CONSTRAINT role_pkey PRIMARY KEY (id_role )
)
WITH (
  OIDS=TRUE
);
ALTER SEQUENCE role_id_seq OWNED BY ref_role.id_role;
ALTER TABLE ref_role
  OWNER TO postgres;
