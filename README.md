# tktpl-syifa
mobile programming course

* * *

Welcome to the code repository for Mobile Programming 2020 course.
This repository hosts weekly tutorial codes and other, course-related
code snippets.

## Table of Contents

1. [Lab 1: Create a hello world](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-1)
2. [Lab 2: Create a Leap Year Checker](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-2)
3. [Lab 3: Create a Stopwatch](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-3)
4. [Lab 4: Create a simple MVVM (My Movies) ](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-4)
5. [Lab 5: Create a simple wifi scanner](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-5)
6. [Lab 5: Create a simple native code](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-6)
7. To be published.

## Lab 6 - Implement OpenGL ES, Android NDK, and JNI
Use native code to say hello and display the result on view (Toast)
- Add the ndkVersion and externalNativeBuild on build.gradle
- Create native code in cpp/string-jni.c to say hello
- Create configuration file cpp/CMakeLists.txt to manage the compilation of the native code
- Create helloFromJni function in MainActivity.java
- Load the native library on MainActivity class initiation (static) and call the function to place the result on Toast
