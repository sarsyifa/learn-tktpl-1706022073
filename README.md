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
5. To be published.

## Lab 4 - MVVM Architecture
Create Model -> Movie, and MovieRepo for the repository. Associating of the MovieViewModel with
the Activity & Fragment. The repository (MovieRepo) is designed to supply up-to-date data to the
MovieViewModel. MovieInfoFragment telling the repository to retrieve the data.
Once it's retrieved, the LiveData (from MovieViewModel) object will get updated,
resulting in the onChange method being called in the Observer.