CREATE SCHEMA IF NOT EXISTS "dlk_operacional_productos" 
	AUTHORIZATION postgres;

COMMENT ON SCHEMA "dlk_operacional_productos" 
	IS 'Esquema para el examen del proyecto pilotoPharma';

CREATE TABLE IF NOT EXISTS "dlk_operacional_productos".opr_cat_productos
(
	md_uuid character varying NOT NULL,
	md_fch date,
    id_producto bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	cod_producto character varying NOT NULL,
    nombre_producto character varying,
    tipo_producto_origen character varying,
	tipo_producto_clase character varying,
	des_producto character varying,
	fch_alta_producto timestamp,
	fch_baja_producto timestamp,
    CONSTRAINT productos_pkey PRIMARY KEY (id_producto)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS "dlk_operacional_productos".opr_cat_productos
    OWNER to postgres;