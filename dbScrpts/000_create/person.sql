CREATE TABLE person
(
  id_person serial NOT NULL, -- id профиля
  name character varying, -- Имя пользователя
  surname character varying, -- Фамилия пользователя
  patrenemic character varying, -- Отчество пользователя
  id_user integer, -- ссылка на пользователя
  id_organization integer, -- ссылка на организацию
  CONSTRAINT person_pkey1 PRIMARY KEY (id_person ),
  CONSTRAINT person_id_organization_fkey FOREIGN KEY (id_organization)
      REFERENCES organization (id_organization) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
	  --,
  --CONSTRAINT person_id_user_fkey FOREIGN KEY (id_user)
    --  REFERENCES customer (id_customer) MATCH SIMPLE
   --   ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=TRUE
);
ALTER TABLE person
  OWNER TO postgres;
COMMENT ON TABLE person
  IS 'Профиль пользователя';
COMMENT ON COLUMN person.id_person IS 'id профиля';
COMMENT ON COLUMN person.name IS 'Имя пользователя';
COMMENT ON COLUMN person.surname IS 'Фамилия пользователя';
COMMENT ON COLUMN person.patrenemic IS 'Отчество пользователя';
COMMENT ON COLUMN person.id_user IS 'ссылка на пользователя';
COMMENT ON COLUMN person.id_organization IS 'ссылка на организацию';

