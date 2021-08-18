SELECT city.* FROM city  /*1*/
INNER JOIN country
ON country.code = city.CountryCode
WHERE country.Code = 'BRA'
AND city.Population > 1000000;