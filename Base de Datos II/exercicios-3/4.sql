select Continent, count(Name) as 'countName' 
from country   
GROUP BY Continent
HAVING countName > 50;