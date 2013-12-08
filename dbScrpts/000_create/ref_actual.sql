-- Table: ref_actual

-- DROP TABLE ref_actual;

CREATE TABLE ref_actual
(
  id_actual serial NOT NULL,
  name character varying,
  CONSTRAINT ref_actual_pkey PRIMARY KEY (id_actual )
)
WITH (
  OIDS=TRUE
);
ALTER TABLE ref_actual
  OWNER TO postgres;
