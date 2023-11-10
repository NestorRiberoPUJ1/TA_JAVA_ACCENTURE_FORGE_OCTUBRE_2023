SELECT * FROM world.countries;






#3
SELECT cities.name, cities.population, cities.country_id FROM cities
WHERE cities.country_code="MEX" AND cities.population > 500000

ORDER BY cities.population DESC
;


#4
SELECT countries.name,languages.language,languages.percentage FROM languages
JOIN countries ON languages.country_id=countries.id
WHERE percentage>89
ORDER BY percentage DESC
;


#5
SELECT name,surface_area,population FROM countries
WHERE surface_area<501 AND population> 100000
;

#6
SELECT name,government_form,capital,life_expectancy FROM countries
WHERE government_form="Constitutional Monarchy" AND capital >200 AND life_expectancy > 75
;

#7
SELECT countries.name as country_name, cities.name as city_name, cities.district,cities.population as population FROM cities
JOIN countries ON cities.country_id = countries.id
WHERE countries.code="ARG" AND cities.district="Buenos Aires" AND cities.population > 500000;

#8
SELECT countries.region, COUNT(countries.region)  as countries FROM countries
GROUP BY region
ORDER BY countries DESC
;


