select Continent, AVG(SurfaceArea)
from country group by Continent order by AVG(SurfaceArea) DESC; 