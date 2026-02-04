# 🛡️ NetTrack - Network Asset Management System

NetTrack is a Full Stack Enterprise Application designed to track IT assets (Routers, Switches, Laptops) and monitor their real-time network status.

Built with **Java Spring Boot** and **MySQL**, it demonstrates modern 3-Tier Architecture and network connectivity handling.

## 🚀 Features
* **Asset Inventory:** CRUD (Create, Read, Update, Delete) operations for network hardware.
* **Real-Time Monitoring:** Integrated "Ping" functionality to check if a device is Online/Offline.
* **Persistent Storage:** Data is stored securely in a relational MySQL database.
* **Secure Access:** Spring Security authentication (Login/Logout protection).
* **Responsive UI:** Dashboard built with Thymeleaf and Bootstrap 5.

## 🛠️ Tech Stack
* **Backend:** Java 17, Spring Boot 3, Spring MVC
* **Database:** MySQL, Spring Data JPA (Hibernate)
* **Frontend:** Thymeleaf, Bootstrap 5, HTML/CSS
* **Security:** Spring Security (Form-based Auth)
* **Tools:** Maven, Git, GitHub

## 📸 Screenshots
*(Add your screenshots here! Drag and drop them into the README on GitHub later)*

## ⚙️ How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Irfan23-iT/net-track-inventory.git](https://github.com/Irfan23-iT/net-track-inventory.git)
    ```
2.  **Configure Database:**
    * Create a MySQL database named `nettrack_db`.
    * Update `application.properties` with your MySQL credentials.
3.  **Run the App:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Access Dashboard:**
    * URL: `http://localhost:8080`
    * Default User: `admin` / `password123`

## 👨‍💻 Author
**Mohamad Irfan Danish Bin Azani** - *Aspiring Software Engineer & Network Admin*