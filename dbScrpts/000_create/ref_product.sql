-- Table: ref_product

-- DROP TABLE ref_product;

CREATE TABLE ref_product
(
  id_product serial NOT NULL,
  name character varying,
  CONSTRAINT ref_product_pkey PRIMARY KEY (id_product )
)
WITH (
  OIDS=TRUE
);
ALTER TABLE ref_product
  OWNER TO postgres;
