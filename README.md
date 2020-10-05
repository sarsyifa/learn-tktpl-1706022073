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
4. To be published.

## Lab 3 - Stopwatch
Use int seconds and boolean running respectively  to record the number of seconds passed.
Sets the Number of seconds on the timer uses a Handler to increment the seconds and update the text view.
* Start: To start the stopwatch
* Stop: To stop the stopwatch
* Reset: To reset the stopwatch to 00.00.00

#### Override onSaveInstanceState
Save the state of the stopwatch if the activity is no longer visible and the timer keeps running.

#### Override Back Button
When the Back button is pressed, The activity is finishing or being destroyed by the system.
