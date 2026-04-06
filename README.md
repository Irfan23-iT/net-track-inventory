# NetTrack Inventory Management System

NetTrack is a full-stack Java web application designed for IT administrators to manage and monitor network assets. It provides a centralized dashboard to track hardware inventory and verify device connectivity in real time.

## Project Overview

This system allows users to maintain a database of IT equipment (routers, switches, laptops, servers) and includes a network-integrated status check feature. Instead of relying purely on manual status updates, the application can execute ICMP pings against device IP addresses to verify if hardware is actively online.

## Features

* **Inventory Management:** Full CRUD (Create, Read, Update, Delete) capabilities for network assets.
* **Network Status Monitoring:** Built-in ping functionality to actively check and update the connectivity status of devices via their IP addresses.
* **Data Persistence:** Relational database integration using Spring Data JPA and MySQL.
* **Secure Access:** Form-based authentication via Spring Security to restrict dashboard access to authorized users.
* **Responsive UI:** Server-side rendered views built with Thymeleaf and Bootstrap 5 for a clean, accessible interface.
  
## Screenshot
<img width="1915" height="717" alt="project1net" src="https://github.com/user-attachments/assets/34a56ffe-379f-4d26-a621-22a0a2406878" />

## Technology Stack

* **Backend:** Java, Spring Boot 3, Spring MVC, Spring Security
* **Data Access:** Spring Data JPA, Hibernate
* **Database:** MySQL
* **Frontend:** HTML5, CSS3, Thymeleaf, Bootstrap 5
* **Build Tool:** Maven

## Prerequisites

To run this project locally, ensure you have the following installed:
* Java Development Kit (JDK) 17 or higher
* MySQL Server (or XAMPP)
* Maven (included via wrapper)

## Installation and Setup

1. **Clone the repository**
   ```bash
   git clone [https://github.com/Irfan23-iT/net-track-inventory.git](https://github.com/Irfan23-iT/net-track-inventory.git)
   cd net-track-inventory
Database Configuration

Start your MySQL server.

Create a new database named nettrack_db.

SQL
CREATE DATABASE nettrack_db;
The application is configured to automatically generate the required database tables upon startup.

Application Properties

If your MySQL root user has a password, update the src/main/resources/application.properties file:

Properties
spring.datasource.username=root
spring.datasource.password=your_password_here
Run the Application

Execute the following command in your terminal:

Bash
./mvnw spring-boot:run
(On Windows, you may need to use mvnw spring-boot:run)

Usage
Once the application has started successfully, access the dashboard via your web browser:

URL: http://localhost:8080

Default Username: admin

Default Password: password123

From the dashboard, you can add new assets, input their IP addresses, and use the "Ping" action to verify their network status.

Author
Mohamad Irfan Danish Bin Azani

