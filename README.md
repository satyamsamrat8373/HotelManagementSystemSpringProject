# 🏨 Hotel Management System

## 📌 Project Overview
The **Hotel Management System** is a **Spring Boot** application that enables hotels to efficiently manage customer bookings, payments, and other essential services. The system follows a well-structured **MVC architecture** with clear separation of concerns.

## 🛠️ Tech Stack & Dependencies
- **Backend:** Spring Boot (Spring Web, Spring Data JPA)
- **Frontend:** Thymeleaf (for UI rendering)
- **Database:** MySQL (Using JPA for ORM)
- **Build Tool:** Maven
- **Other Dependencies:** Spring DevTools

# Login Page ------>

![Screenshot 2025-03-01 185127](https://github.com/user-attachments/assets/2337ba94-60dd-4ab0-b381-297c959eedd9)

# Dashboard ----->

![Screenshot 2025-03-01 185148](https://github.com/user-attachments/assets/740d9566-38b2-4536-b111-9fda3a513435)

# Customer Details ----->

![Screenshot 2025-03-01 185203](https://github.com/user-attachments/assets/2baee423-517a-4e9b-b39b-6aad8b905653)

# Edit Details ----->

![Screenshot 2025-03-01 185220](https://github.com/user-attachments/assets/b23cf9cf-0737-47d7-a8f7-caaca17c53be)

# Delete Details ---->

![Screenshot 2025-03-01 190439](https://github.com/user-attachments/assets/a781203e-3874-4571-9160-e8a55ad963bf)

# LogOut Page ----->

![Screenshot 2025-03-01 185248](https://github.com/user-attachments/assets/8cf0dcc8-5650-44f9-bcf0-0aa6eaf52a43)

# Mysql Database ---->

![Screenshot 2025-03-01 191141](https://github.com/user-attachments/assets/3741e7c8-0659-498f-9f4f-b72d6600fa80)

## 📂 Project Structure
📦 Hotel-Management-System 
┣ 📂 src ┃ 
  ┣ 📂 main ┃ ┃ 
    ┣ 📂 java ┃ ┃ ┃ 
      ┣ 📂 com.example.demo ┃ ┃ ┃ ┃ 
        ┣ 📂 controller # Handles HTTP Requests ┃ ┃ ┃ ┃ 
          ┣ 📂 service # Business Logic Layer ┃ ┃ ┃ ┃ 
            ┣ 📂 repository # Database Operations (JPA) ┃ ┃ ┃ ┃ 
              ┣ 📂 entities # Customer Entity Classes ┃ ┃ ┃ ┃ 
                ┣ 📜 DemoApplication.java ┃ ┃ 
                ┣ 📂 resources ┃ ┃ ┃ 
                ┣ 📂 templates # Thymeleaf HTML Files ┃ ┃ ┃ 
                ┣ 📜 application.properties 
                ┣ 📜 pom.xml (Maven Dependencies) 
                ┣ 📜 README.md (Project Documentation)


## 🔥 Features
✅ **Customer Management:** Add, edit, and delete customer records.  
✅ **Room Management:** Assign rooms to customers with unique IDs.  
✅ **Payment Processing:** Manage payments for customer stays.  
✅ **User-Friendly Interface:** Uses **Thymeleaf** for clean UI rendering.  
✅ **RESTful APIs:** Built with **Spring Web** for smooth interactions.  
✅ **Database Integration:** Uses **MySQL with Spring Data JPA**.  
