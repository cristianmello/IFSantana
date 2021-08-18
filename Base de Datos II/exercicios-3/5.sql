select SurfaceArea, Name from country 
where SurfaceArea = (Select MAX(SurfaceArea) from country);