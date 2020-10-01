INSERT INTO recipes (id, title, description, instructions, photo_url, creation_date) VALUES (
	1,
	'Spanish omelette',
	'Potato omelette with onion',
	'Scrape 500g new potatoes or leave the skins on, if you prefer.
Cut them into thick slices. Chop 1 onion.
Heat 150ml extra-virgin olive oil in a large frying pan, add the potatoes and onion and stew gently, partially covered, for 30 minutes, stirring occasionally until the potatoes are softened.
Strain the potatoes and onion through a colander into a large bowl (set the strained oil aside).
Beat 6 eggs, then stir into the potatoes and plenty of salt. Heat a little of the strained oil in a smaller pan.
Tip everything into the pan and cook on a moderate heat, using a spatula to shape the omelette into a cushion.
When almost set, invert on a plate and slide back into the pan and cook a few more minutes.
Invert twice more, cooking the omelette briefly each time and pressing the edges to keep the cushion shape. Slide on to a plate and cool for 10 minutes before serving.',
	'https://www.196flavors.com/wp-content/uploads/2014/10/Spanish-tortilla-FP.jpg',
	'2020-02-02 22:22'
);

INSERT INTO recipes (id, title, description, instructions, photo_url, creation_date) VALUES (
	2,
	'Basic Scrambled Eggs',
	'Scrambled eggs are a go-to breakfast dish — learn how to make yours perfectly creamy, fluffy, and delicious every time.',
	'In a large bowl, whisk together the eggs, 1 tablespoon water, and 1/2 teaspoon each salt and pepper.
Heat the oil or melt the butter in a 10-inch nonstick skillet over medium heat. Add the eggs and cook, stirring with a rubber spatula every few seconds, to desired doneness, 2 to 3 minutes for medium-soft eggs.',
	'https://hips.hearstapps.com/clv.h-cdn.co/assets/cm/15/09/54f113969371c_-_basic-scrambled-eggs-recipe-wdy0514-de.jpg',
	'2020-10-01 11:11'
);

INSERT INTO recipes (id, title, description, instructions, photo_url, creation_date) VALUES (
	3,
	'Fondant potatoes',
	'Try something new with potatoes. Fondant potatoes are favourites with chefs, and are seasoned with rosemary and thyme. They are gorgeous when served as part of a Sunday roast.',
	'Slice the ends off the potatoes so they lay flat on either side.
Heat the oil in a pan over a medium-low heat. When hot, add the potatoes cut-side down. Fry for 5-7 mins, or until deep golden brown, then flip and fry on the other side. Add the butter to the pan to melt.
Scatter the garlic and herbs around the potatoes and season well. Carefully pour the stock around the veg, being aware of any hot butter that may splash out. Cover and simmer gently for 25-30 mins, or until the potatoes are tender, then serve.',
	'https://images.immediate.co.uk/production/volatile/sites/30/2020/08/fondant-potatoes-6db95cf.jpg',
	'2020-03-03 03:33'
);

INSERT INTO ingredients (id, name) VALUES (1, 'potato');
INSERT INTO ingredients (id, name) VALUES (2, 'onion');
INSERT INTO ingredients (id, name) VALUES (3, 'olive oil');
INSERT INTO ingredients (id, name) VALUES (4, 'egg');
INSERT INTO ingredients (id, name) VALUES (5, 'salt');
INSERT INTO ingredients (id, name) VALUES (6, 'pepper');
INSERT INTO ingredients (id, name) VALUES (7, 'butter');
INSERT INTO ingredients (id, name) VALUES (8, 'garlic');
INSERT INTO ingredients (id, name) VALUES (9, 'rosemary');
INSERT INTO ingredients (id, name) VALUES (10, 'thyme');
INSERT INTO ingredients (id, name) VALUES (11, 'chicken stock');
INSERT INTO ingredients (id, name) VALUES (12, 'vegetable stock');

INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 1, 500, 'g');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (1, 2, 1, 'units', 'preferably white');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (1, 3, 150, 'ml', 'extra-virgin');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 4, 6, 'units');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 5, 1, 'a bit');

INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (2, 4, 8, 'units', 'large');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (2, 5, 1, 'a bit');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (2, 6, 1, 'a bit');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (2, 3, 1, 'tablespoon');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (2, 7, 1, 'tablespoon');

INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (3, 1, 6, 'units', 'medium Maris Piper');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (3, 3, 1, 'tablespoon');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (3, 7, 200, 'g', 'unsalted, cubed');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (3, 8, 4, 'units', 'large cloves, based');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (3, 9, 2, 'sprigs');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (3, 10, 2, 'sprigs');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (3, 11, 200, 'ml');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (3, 12, 200, 'ml');


