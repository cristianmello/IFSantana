select SurfaceArea, Name from country
where SurfaceArea = (Select MIN(SurfaceArea) from country);