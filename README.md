# OOP1 - Online Shop

## Project Description
This project is a simple online shop using Object-Oriented Programming (OOP) concepts. The project demonstrates the relationship between classes such as Customer, Order and Product.

The main responsibility of the system is to calculate the total price of an order.

A customer can place an order, an order can contain multiple products and order details and total price will be displayed.

## Class Structure
### Customer Class
The Customer class represents a customer and contains attributes such as:
- customerId
- name
- email
### Product Class
The Product class represents a product with the following attributes:
- productId
- productName
- price
### Order Class
The Order class represents an order placed by a customer. It contains:
- orderId
- list of products
- customer

The Order class provides methods to:
- addProduct()
- removeProduct()
- getOrderDateAndTime()
- calculateTotalPrice()
- displayOrderDetails()

### Optional Features
1. Implemented a removeProduct method and displayed the updated product list after removal.
2. Added a getOrderDateAndTime method to display the order Date and Time.
3. Implemented an Address class to represent the shipping address,
which is displayed along with the order and customer details.
4. Added a Payment class to store and display the payment method and status for an order.
5. Added OrderStatus field to track and display the current status of an order.
6.	Implemented a discount feature to apply a percentage-based discount on the total order price.
7.	Introduced an OrderItem class to support product quantity, allowing multiple units of the same product to be added to an order and enabling accurate price calculation.