CREATE TABLE customer
(
  id_customer serial NOT NULL, -- id пользователя
  login character varying,
  password character varying,
  id_role integer,
  email character varying,
  is_delite boolean,
  id_person integer,
  is_activated boolean, -- Активизирована учетная запись (1- активизирована, 0 -иначе)
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
COMMENT ON COLUMN customer.is_activated IS 'Активизирована учетная запись (1- активизирована, 0 -иначе)';

