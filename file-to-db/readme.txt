1. Структура файла (определена в mappings\mappings.xml) и состоит из следующих полей
	Family_cyr
	Name_cyr
    Patronymic_cyr
    FIO_lat
    BirthDate
    BirthYear
    DocNum
    DocSer
	
	- Файл в формате UTF-8
	- Разделитель ;
	- Расширение csv
	- Файл без "шапки" с полями пример в input\.camel\Копия 201805_Список5_short.csv

2. Для изменения параметров соединения к БД, использовать application.properties
3. Для загрузки файла, его нужно "подложить" в \input
4. Логи в \logs 
	