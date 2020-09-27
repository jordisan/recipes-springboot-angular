INSERT INTO recipes (id, title, description, instructions, photo_url, creation_date) VALUES (
	1,
	'Spanish omelette',
	'Potato omelette with onion',
	'Scrape 500g new potatoes or leave the skins on, if you prefer.
Cut them into thick slices. Chop 1 onion.
Heat 150ml extra-virgin olive oil in a large frying pan, add the
potatoes and onion and stew gently, partially covered, for 30
minutes, stirring occasionally until the potatoes are softened.
Strain the potatoes and onion through a colander into a large bowl
(set the strained oil aside).
Beat 6 eggs, then stir into the potatoes and plenty of salt. Heat a
little of the strained oil in a smaller pan.
Tip everything into the pan and cook on a moderate heat, using a
spatula to shape the omelette into a cushion.
When almost set, invert on a plate and slide back into the pan and
cook a few more minutes.
Invert twice more, cooking the omelette briefly each time and
pressing the edges to keep the cushion shape. Slide on to a plate
and cool for 10 minutes before serving.',
	'https://flexit.es/tortilla-espa%C3%B1ola.jpg',
	'2020-02-02 22:22'
);

INSERT INTO ingredients (id, name) VALUES (1, 'potato');
INSERT INTO ingredients (id, name) VALUES (2, 'onion');
INSERT INTO ingredients (id, name) VALUES (3, 'extra-virgin olive oil');
INSERT INTO ingredients (id, name) VALUES (4, 'egg');
INSERT INTO ingredients (id, name) VALUES (5, 'salt');

INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 1, 500, 'g');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units, details) VALUES (1, 2, 1, 'units', 'preferably white');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 3, 150, 'ml');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 4, 6, 'units');
INSERT INTO recipes_ingredients (recipe_id, ingredient_id, quantity, units) VALUES (1, 5, 1, 'a bit');