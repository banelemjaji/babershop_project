# BarberShop_Project

An Android application built using Java and Firebase to simplify the process of booking and managing appointments at a barbershop. This project offers features for both barbers and their customers, allowing seamless appointment scheduling and management.

## Overview

The BarberShop App enables barbers (the client) to view and manage their bookings, while customers can easily book appointments at their preferred time. The app provides a simple and intuitive interface for both barbers and customers, improving the overall experience of managing barbershop appointments.

## Features

### Barber Features:
- **Login:** Barbers can log in to view their scheduled appointments.
- **View Appointments:** A barber can view all upcoming appointments, organized by date and time.
- **Cancel Appointments:** Barbers can cancel appointments if necessary, and the customer will be notified.

### Customer Features:
- **Register Account:** Customers can create a new account by registering in the app.
- **Login:** Registered customers can log in to access their dashboard.
- **Book Appointment:** Customers can select a date and time for their appointment.
- **View Booking Status:** Customers can see their confirmed bookings and any changes made by the barber.
  
## Technologies Used

- **Java:** The main programming language used to build the Android app.
- **Firebase Authentication:** Handles user sign-up, login, and authentication.
- **Firebase Firestore:** Manages the database to store user information and appointments.
  
## Installation & Setup

To run this project locally, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/barbershop_project.git
    ```
2. **Open the project in Android Studio.**
3. **Configure Firebase:**  
   - Create a Firebase project in the [Firebase Console](https://console.firebase.google.com/).
   - Add your Android app to the Firebase project by following the instructions to get the `google-services.json` file.
   - Place the `google-services.json` file in the `app/` directory of your project.



