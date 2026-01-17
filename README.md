---

# ✅ Todo List REST API (Spring Boot + Kotlin)

This project is a **Todo List REST API** built using **Spring Boot and Kotlin**, inspired by the
**[Todo List API project from roadmap.sh](https://roadmap.sh/projects/todo-list-api)**.

It provides a complete backend system for managing todos with **authentication, authorization, pagination, and JWT-based security**.

---

## 🚀 Features

### 🔐 Authentication & Authorization

* User registration
* User login
* JWT token-based authentication
* Secure endpoints using Spring Security
* Role-based user system

### 📝 Todo Management

* Create todo
* Update todo
* Delete todo
* Get todo by ID
* Get all todos with pagination

### 📄 Pagination

* Page-based pagination
* Custom paginated response format

### ⚠️ Error Handling

* Custom exceptions
* Meaningful error responses
* Proper HTTP status codes

---

## 📌 API Endpoints

### Auth

| Method | Endpoint             | Description           |
| ------ | -------------------- | --------------------- |
| POST   | `/api/auth/register` | Register new user     |
| POST   | `/api/auth/login`    | Login and receive JWT |

### Todos

| Method | Endpoint                     | Description     |
| ------ | ---------------------------- | --------------- |
| GET    | `/api/todos?page=1&limit=10` | Get all todos   |
| GET    | `/api/todos/{id}`            | Get todo by ID  |
| POST   | `/api/todos`                 | Create new todo |
| PUT    | `/api/todos/{id}`            | Update todo     |
| DELETE | `/api/todos/{id}`            | Delete todo     |

> 🔒 Todo endpoints require a valid JWT token.

---

## 🧩 Tech Stack

* **Kotlin**
* **Spring Boot**
* **Spring Security**
* **JWT Authentication**
* **Spring Data JPA**
* **Hibernate**
* **MySQL / PostgreSQL (or H2 for testing)**
* **RESTful API design**

---

## 🏗 Project Architecture

* Controller Layer — handles HTTP requests
* Service Layer — business logic
* Repository Layer — database access
* DTO Layer — request & response objects
* Security Layer — JWT authentication & filters
* Exception Handling — custom error management

---

## 🎯 Learning Objectives

This project was built to practice:

* REST API design
* Spring Boot with Kotlin
* JWT authentication flow
* Pagination implementation
* Clean architecture
* Backend best practices
* Following real-world API specifications

Project inspiration:
👉 [https://roadmap.sh/projects/todo-list-api](https://roadmap.sh/projects/todo-list-api)

---
