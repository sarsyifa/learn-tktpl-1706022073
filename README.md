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
7. [Lab 5: Create a simple app using cross-platform frameworks](https://github.com/sarsyifa/tktpl-lab7-1706022073)
8. To be published.

## Lab 7 - Android Native vs Cross-platform

How Android Native apps work.

When drawing, you first call the Java code of the Android framework.
The Android system libraries provide the components responsible for drawing themselves to a
Canvas object, which Android can then render with Skia, a graphics engine written in C/C++ that
calls the CPU or GPU to complete the drawing on the device.

Cross-platform frameworks typically work by creating an abstraction layer over the underlying
native Android and iOS UI libraries, attempting to smooth out the inconsistencies of each platform
representation. App code is often written in an interpreted language like JavaScript,
which must in turn interact with the Java-based Android or Objective-C-based iOS system libraries
to display UI. All this adds overhead that can be significant, particularly where there is a lot of
interaction between the UI and the app logic.

By contrast, Flutter minimizes those abstractions, bypassing the system UI widget libraries in
favor of its own widget set. The Dart code that paints Flutter’s visuals is compiled into native
code, which uses Skia for rendering. Flutter also embeds its own copy of Skia as part of the engine,
 allowing the developer to upgrade their app to stay updated with the latest performance improvements
 even if the phone hasn’t been updated with a new Android version. The same is true for Flutter on
 other native platforms, such as iOS, Windows, or macOS.

### Repository
- [Native](https://github.com/sarsyifa/learn-tktpl-1706022073/tree/lab-7)
- [Cross-platform (Flutter)](https://github.com/sarsyifa/tktpl-lab7-1706022073)