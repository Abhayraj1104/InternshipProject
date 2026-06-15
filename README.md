# Spring Boot Order Management System

A robust, enterprise-grade Order Processing, E-Commerce, and Inventory Management system built using **Java 17** and the **Spring Boot** framework. The project is designed with modularity, clean architecture, and the Single Responsibility Principle (SRP) in mind, dividing service functionalities into dedicated modules.

---

## 👥 Authors & Contributors

This project was developed by:
* **Onkar Shinde**
* **Abhayraj Gaikwad**
* **Onkar Pawar**
* **Jyotiram Kokane**

---

## 📝 Project Overview

The **Spring Boot Order Management System** provides a comprehensive set of REST APIs to manage an e-commerce ecosystem. It covers everything from product catalogs, user accounts, and role management to shipping, location-based mapping, invoice generation, feedback systems, and detailed tracking.

### Key Capabilities

1. **User & Identity Management**
   - Role-based authorization with custom roles.
   - Hierarchical administrator and operations setup supporting **Owner**, **Admin**, **Manager**, **Employee**, and **User** (Customer) entities.

2. **Catalog & Inventory Management**
   - Multi-level taxonomy: **Category** and **SubCategory** management.
   - **Brand** registration and product classification.
   - Product tracking including detailed description, pricing, and stock/inventory levels.

3. **Order Processing & Payments**
   - Order creation, price tracking, and order aggregation.
   - Flexible payment processing integrations supporting **Card**, **UPI**, and **Cash on Delivery (COD)** under a unified **Payment Mode** controller.
   - Detailed **Invoice** generation matching orders and payments.

4. **Geographical & Shipping Infrastructure**
   - Granular regional hierarchy: **Country** -> **State** -> **District** -> **Taluka** -> **Town**.
   - Custom **Address** mappings linked to users and shipping modules.
   - Real-time **Shipping Details** and delivery status **Tracking**.

5. **Customer Relationship & Feedback**
   - **Customer Query** portal for handling user support tickets.
   - **Product Review** & ratings system.
   - Dedicated **Feedback** submission handlers.

---

## 🏗️ Architectural Highlights

The codebase utilizes a modern Spring Boot design pattern enforcing the **Single Responsibility Principle (SRP)**:
- **Separation of Services**: Instead of huge monolithic service classes, each CRUD action has its own interface and implementation (e.g., `OrderCreateService`, `OrderDeleteService`, `OrderUpdateService`, `OrderFetchService`, `OrderFetchAllService`).
- **Standard REST API Standards**: Utilizes Spring WebMVC Annotations to construct endpoints.
- **Relational Integrity**: Uses Hibernate / JPA annotations (such as `@ManyToOne` and `@JsonManagedReference`) to map complex database structures gracefully without circular dependency issues.

---

## 🛠️ Technology Stack

- **Language**: Java 17
- **Framework**: Spring Boot 4.1.0 / 3.x
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **API Documentation**: Springdoc OpenAPI (Swagger UI)

---

## ⚙️ Configuration & Setup

### Database Settings
By default, the application is configured to connect to a MySQL database named `springdb5`. Check `src/main/resources/application.properties` to modify these details:
```properties
server.port=9090
spring.datasource.url=jdbc:mysql://localhost:3306/springdb5
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

### Running the Application

1. **Prerequisites**: Ensure you have **Java 17** and **MySQL** installed and running on your system.
2. **Database Initialization**: Create a schema named `springdb5` in MySQL.
3. **Build the Project**:
   ```bash
   # Using Maven wrapper
   ./mvnw clean install
   ```
4. **Run the Project**:
   ```bash
   ./mvnw spring-boot:run
   ```
5. **Access the Application**:
   - The application runs on port `9090`.
   - Swagger Documentation: Open your browser and navigate to `http://localhost:9090/swagger-ui/index.html` to explore the REST API endpoints.
