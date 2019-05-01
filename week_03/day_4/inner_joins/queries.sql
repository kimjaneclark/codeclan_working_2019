-- customers left pizza_orders right

-- all records with associated date
-- SELECT customers.*, pizza_orders.* FROM customers
-- INNER JOIN pizza_orders
-- ON customers.id = pizza_orders.customer_id;
--
-- SELECT customers.name, pizza_orders.topping FROM customers
-- INNER JOIN pizza_orders
-- ON customers.id = pizza_orders.customer_id;

-- returns all data even if not associated data
SELECT customers.*, pizza_orders.* FROM customers
LEFT JOIN pizza_orders
ON customers.id = pizza_orders.customer_id;
