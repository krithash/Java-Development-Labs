# Wanderlust Travels Ticket Booking System

## Overview

Wanderlust Travels Ticket Booking System is a menu-driven console application developed using Java. The application simulates basic airline reservation operations, allowing users to register, log in, search available flights, book tickets, view booking details, and cancel reservations.

The project demonstrates the practical use of Core Java, File Handling, Exception Handling, Input Validation, and Fare Calculation in a real-world inspired application.

---

## Features

* User Registration System
* Login Authentication
* Comprehensive User Input Validation
* Flight Search by Source and Destination
* Flight Booking
* Travel Class Selection

  * Economy Class
  * Premium Economy Class
  * Business Class
  * First Class
* Meal Preference Selection
* Dynamic Fare Calculation
* GST Calculation
* Ticket Generation
* View Booking Details
* Ticket Cancellation
* File-Based Data Storage
* Logout Functionality
* Menu-Driven Console Interface

---

## Concepts and Libraries Used

* Core Java
* File Handling
* Exception Handling
* Arrays
* String Manipulation
* Input Validation
* BufferedReader
* BufferedWriter
* FileReader
* FileWriter
* Scanner Class

---

## Data Storage

The application uses text files to store and manage information.

| File Name         | Purpose                                        |
| ----------------- | ---------------------------------------------- |
| details.txt       | Stores user registration and login information |
| flightdetails.txt | Stores available flight routes and schedules   |
| flightticket.txt  | Stores generated ticket and booking details    |

---

## Key Functionalities

### Registration and Validation

The registration module validates:

* Full Name
* Age
* Gender
* Email Address
* Mobile Number
* Password Strength

### Authentication

* Username Verification
* Password Verification
* Limited Retry Attempts
* Re-registration Option after repeated login failures

### Flight Search, Booking and Ticket Management

* Search flights using source and destination cities
* Display matching flight details
* Select travel class
* Select meal preference
* Generate booking details
* View existing booking
* Cancel booking

### Fare Calculation

The total fare is calculated based on:

* Selected Travel Class
* Meal Preference
* Applicable GST

---

## Project Structure

```text
Wanderlust-Travels-Ticket-Booking/
├── Home_Page.java
└── README.md
```

---

## Important Note

The current implementation uses absolute Windows file paths:

```text
D:\JAVA\Mini project\details.txt
D:\JAVA\Mini project\flightdetails.txt
D:\JAVA\Mini project\flightticket.txt
```

Update these file paths according to your local system before running the application.

---

## Author

**Krithash V**

Electronics and Communication Engineering (ECE)
