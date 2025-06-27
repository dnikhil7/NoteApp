## NotesApp

# Overview
NotesApp is a simple Java-based console application that allows users to write and read text notes using basic file input/output operations. It demonstrates the use of FileOutputStream and FileInputStream to handle file writing and reading in Java.

# Features
Write custom text input to a file

Read saved notes from the file

Simple command-line interface for interaction

# Technologies Used
Java

File I/O (java.io.FileOutputStream, java.io.FileInputStream)

Scanner for user input

# How It Works
Upon launching the application, the user is presented with two options:

Enter 1 to write a new note.

Enter 2 to read an existing note.

If the user selects to write:

They are prompted to type a message.

The note is saved to the specified file path on their local system.

If the user selects to read:

The content of the note file is displayed on the console.

# File Path
The note is saved at:

C:\Users\doula\Documents\NotesApp\ReadAndWrite1.txt
Ensure the directory exists or modify the path in the code before running the application.

# How to Run
Clone the repository:

git clone https://github.com/your-username/NotesApp.git
Open the project in your Java IDE (such as Eclipse or IntelliJ).

Run the Test class which contains the main method.

# Folder Structure
com.service
├── ReadFile.java      // Reads data from the file
├── Write.java         // Writes data to the file
└── Test.java          // Main class to run the application
Notes
This application is designed for educational and demonstration purposes.

It performs basic file handling and does not support concurrent users or advanced error handling.

License
This project is open-source and available for educational use. No license restrictions are applied.
