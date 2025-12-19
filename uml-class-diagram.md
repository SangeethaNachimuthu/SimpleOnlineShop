```mermaid
classDiagram
    class Customer {
        -int customerId
        -String name
        -String email
        -Address address
        +Customer(customerId : int, name : String, email : String, address : Address)
        +getCustomerId() : int
        +setCustomerId(customerId : int) : void
        +getName() : String
        +setName(name : String) : void
        +getEmail() : String
        +setEmail(email : String) : void
        +getAddress() : Address
        +setAddress(address : Address) : void
    }
    class Product {
        -int productId
        -String productName
        -String price
        +Product(productId : int, productName : String, price : double)
        +getProductId() : int
        +setProductId(productId : int) : void
        +getProductName() : String
        +setProductName(productName : String) : void
        +getPrice() : double
        +setPrice(price : double) : void
    }
    class Order {
        -int orderId
        -List~OrderItem~ orderItemList
        -Customer customer
        -Payment payment
        -OrderStatus : status
        -discountPercentage : double
        +Order(orderId : int, customer : Customer, payment : Payment)
        +getOrderId() : int
        +setOrderId(orderId : int) : void
        +getOrderItemList() : List~orderItemList~
        +getCustomer() : Customer
        +setCustomer(customer : Customer) : void
        +getPayment() : Payment
        +setPayment(payment : Payment) : void
        +getStatus() : OrderStatus
        +setStatus(status : OrderStatus) : void
        +getDiscountPercentage() : double
        +setDiscountPercentage(discountPercentage : double) : void
        +addProduct(product : Product, quantity : int) : void
        +removeProduct(product : Product) : void
        +getOrderDateAndTime() : String
        +calculateTotalPrice() : double
        +displayOrderDetails() : void
    }
    class Address {
        -String number
        -String streetName
        -String city
        -int postCode
        -String country
        +Address(number : String, streetName : String, city : String, postCode : int, country : String)
        +getNumber() : String
        +setNumber(number : String) : void
        +getStreetName() : String
        +setStreetName(streetName : String) : void
        +getCity() : String
        +setCity(city : String) : void
        +getPostCode() : int
        +setPostCode(postCode : int) : void
        +getCountry() : String
        +setCountry(country : Country) : void
        +toString() : String
    }
    class Payment {
        -String paymentMethod
        -String paymentStatus
        +Payment(paymentMethod : String, paymentStatus : String)
        +getPaymentMethod() : String
        +setPaymentMethod(paymentMethod : String) : void
        +getPaymentStatus() : String
        +setPaymentStatus(paymentStatus : String) : void
        +displayPaymentDetails() : void
    }
    class OrderStatus {
        <<enumeration>>
        CREATED
        CONFIRMED
        SHIPPED
        CANCELED
    }
    class OrderItem {
        -Product product
        -int quantity
        +OrderItem(product : Product, quantity : int)
        +getProduct() : Product
        +setProduct(product : Product) : void
        +getQuantity() : int
        +setQuantity(quantity : int) : void
        +getLineTotal() : double
    }
    
   Order --> "1" Customer : belongsTo
   Order --> "1..*" OrderItem : contains
   OrderItem --> "1" Product : refersTo
   Customer --> "1..*" Address : have
   Order --> "1" Payment : has
   Order --> "1" OrderStatus : hasStatus
```
