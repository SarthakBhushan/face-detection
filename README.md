# face-detection
# 👤 Java Face Detection App using OpenCV

A basic face detection application built using **Java**, **OpenCV**, and **Haar Cascades**. The application supports real-time face detection using:
- External USB webcam
- Mobile phone camera via IP (e.g., using IP Webcam app)

---

## 🚀 Features

- ✅ Real-time face detection using Haar Cascade
- 🎥 Supports multiple camera sources:
  - USB wired webcam
  - IP camera (mobile phone over WiFi)
- 📦 Uses OpenCV library for computer vision
- 🔍 Visual overlay of face bounding boxes
- 🔌 Lightweight and runs on most machines

---

## 🧰 Technologies Used

- Java (JDK 8+)
- OpenCV (Java bindings)
- Haar Cascade XML classifier (e.g., `haarcascade_frontalface_default.xml`)
- USB webcam / IP Webcam (Android App)
- Maven (optional for dependency management)

---

## 📸 Camera Setup

### 1. USB Webcam
Plug in your external USB camera. It is usually indexed as camera 0 or 1 depending on your system.

```java
VideoCapture camera = new VideoCapture(0); // 0 or 1 for external USB webcam
```

### 2. Mobile Phone as IP Camera
Use the **IP Webcam** Android app:
1. Install from Play Store: [IP Webcam](https://play.google.com/store/apps/details?id=com.pas.webcam)
2. Connect phone and computer to the same WiFi.
3. Launch the app and note the stream URL (e.g., `http://192.168.1.4:8080/video`).
4. Access it in code like:
```java
VideoCapture camera = new VideoCapture("http://192.168.1.4:8080/video");
```

---

## 🧪 Haar Cascade Classifier

Download Haar cascades from OpenCV GitHub or local OpenCV install. Example:
```java
CascadeClassifier faceDetector = new CascadeClassifier("haarcascade_frontalface_default.xml");
```

---

## ⚙️ How to Run

1. Make sure OpenCV is properly set up with native libraries linked (`.dll`, `.so`, or `.dylib`).
2. Download or clone this project.
3. Add OpenCV to your classpath.
4. Replace the camera source as needed.
5. Compile and run:
```bash
javac FaceDetector.java
java FaceDetector
```

---

## 📁 Project Structure

```
FaceDetectionApp/
├── FaceDetector.java
├── haarcascade_frontalface_default.xml
├── lib/
│   └── opencv-xxx.jar
├── native/
│   └── opencv_javaXXX.dll/.so/.dylib
└── README.txt
```

---

## 📷 Sample Output (Visual)

A window opens showing the camera feed with rectangles drawn around detected faces in real time.

---

## 🛠 Future Improvements

- 😎 Eye and smile detection
- 📷 Snapshot feature on face detection
- 🧠 Use DNN-based face detection for better accuracy
- 📱 Android port using OpenCV Android SDK

---

## 🙏 Acknowledgments

- OpenCV Java Bindings
- Haar Cascade Classifiers by OpenCV
- IP Webcam Android App
