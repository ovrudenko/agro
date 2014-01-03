SET PATH=%PATH%;C:\Program Files\PostgreSQL\9.1\bin;
SET AGROMIR_HOME=D:\Develope\obs
SET PGPASSWORD=12345678
SET CREATE_DB_SCRIPTS_HOME=%AGROMIR_HOME%\dbScrpts\000_create
psql -h localhost -p 5432 -U postgres -f %CREATE_DB_SCRIPTS_HOME%\0_agro_db_create.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_advert_type.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_area.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_product.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_actual.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_smtp_address.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_role.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\ref_volume_type.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\organization.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\person.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\customer.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\advert.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\telephone.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\stat_advert_actuality.sql
psql -h localhost -p 5432 -U postgres -d agro -f %CREATE_DB_SCRIPTS_HOME%\stat_advert_story.sql
pause