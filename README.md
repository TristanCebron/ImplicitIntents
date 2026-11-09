# ImplicitIntents

An Android application demonstrating the use of **Implicit Intents** to interact with other applications and Android system components.

## 📱 Overview

ImplicitIntents is an Android application that allows users to perform actions through other installed applications without explicitly specifying which application should handle the request.

The application demonstrates how Android Implicit Intents can be used to open websites, display locations on maps, and share text with other applications.

## ✨ Features

- **Open Website** – Enter a URL and open it in the device's default web browser.
- **Open Location** – Enter a location or address and display it in a compatible maps application.
- **Share Text** – Enter custom text and share it with other applications using Android's sharing interface.

## 🛠️ Technologies Used

- **Java** – Application logic and Intent handling.
- **Android SDK** – Android application development framework.
- **XML** – User interface layout and string resources.
- **Android Studio** – Development environment.
- **Android Intents** – Communication between applications.

## ⚙️ Implementation

The application uses several Android components and APIs:

| Component | Purpose |
|---|---|
| `Intent.ACTION_VIEW` | Opens websites and map locations. |
| `Uri` | Converts URLs and location queries into URI objects. |
| `resolveActivity()` | Checks whether an application can handle an Intent. |
| `ShareCompat.IntentBuilder` | Creates an Intent for sharing text. |
| `EditText` | Allows users to enter URLs, locations, and text. |
| `LinearLayout` | Organizes the application interface vertically. |

### How It Works

**1. Opening Websites**

The application reads a URL from an input field, converts it into a `Uri` object, and launches an implicit Intent using `Intent.ACTION_VIEW`.

**2. Opening Locations**

A location entered by the user is converted into a geographic URI:

```java
Uri.parse("geo:0,0?q=" + location);
```

Android then finds a compatible application to display the requested location.

**3. Sharing Text**

The application uses `ShareCompat.IntentBuilder` with the MIME type `text/plain` to open Android's sharing interface and allow users to select an application.

## 🚀 Getting Started

### Prerequisites

- Android Studio
- Android SDK
- Android emulator or a physical Android device

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/YOUR_USERNAME/ImplicitIntents.git
   ```

2. Open the project in Android Studio.

3. Allow Gradle to synchronize the project.

4. Run the application on an Android emulator or a connected device.

## 📂 Project Structure

```text
ImplicitIntents/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── MainActivity.java
│           ├── res/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   └── values/
│           │       └── strings.xml
│           └── AndroidManifest.xml
└── README.md
```

## 🎯 Purpose

The project demonstrates how Android applications can communicate with other applications through implicit intents, providing a simple and effective way to integrate external functionality without implementing everything directly within a single application.

---

**Built with Android Studio and Java.**
