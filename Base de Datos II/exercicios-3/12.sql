select Continent, MAX(SurfaceArea)
from country group by Continent order by MAX(SurfaceArea) desc;