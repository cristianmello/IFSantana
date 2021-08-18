SELECT             
	country.Name as 'countryName',	
	count(countrylanguage.Language) as 'countLanguage'
FROM country INNER JOIN countrylanguage 
ON countrylanguage.CountryCode = country.code
group by countryName;