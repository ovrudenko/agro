-- Table: customer

-- DROP TABLE customer;

CREATE TABLE customer
(
  id_customer serial NOT NULL, -- id пользователя
  login character varying,
  password character varying,
  id_role integer,
  email character varying,
  is_delite boolean,
  id_person integer,
  CONSTRAINT customer_pkey PRIMARY KEY (id_customer ),
  CONSTRAINT customer_id_person_fkey FOREIGN KEY (id_person)
      REFERENCES person (id_person) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT customer_id_role_fkey FOREIGN KEY (id_role)
      REFERENCES ref_role (id_role) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE customer
  OWNER TO postgres;
COMMENT ON TABLE customer
  IS 'пользователь';
COMMENT ON COLUMN customer.id_customer IS 'id пользователя';

