 select
  category.name as 'nameCategory',
  count(film_category.category_id)
  FROM category INNER JOIN film_category
  ON category.category_id = film_category.category_id
  group by nameCategory;