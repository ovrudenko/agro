set PSQL_HOME=C:\Program Files (x86)\PostgreSQL\9.1\bin
set AGRO_HOME=F:\Develope\obs
set DB_SCRIPTS=%AGRO_HOME%\dbScripts
cd %PSQL_HOME%
echo runas  /user:postgres psql.exe
REM -U postgres -d agro -P 12345678 -f %DB_SCRIPTS%\test.sql