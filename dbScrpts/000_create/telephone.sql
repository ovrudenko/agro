-- Table: telephone

-- DROP TABLE telephone;

CREATE TABLE telephone
(
  id_tel serial NOT NULL,
  id_person integer,
  tel_number character varying,
  CONSTRAINT telephone_pkey PRIMARY KEY (id_tel ),
  CONSTRAINT telephone_id_person_fkey FOREIGN KEY (id_person)
      REFERENCES person (id_person) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE telephone
  OWNER TO postgres;
