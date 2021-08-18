Select Name, AVG(Population) from country  
group by Name
Having AVG(Population) > 70000 order by AVG(Population) ASC;