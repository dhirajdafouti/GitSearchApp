## Political Preparedness

PolitcalPreparedness is an example application built to demonstrate core Android Development skills as presented in the Udacity Android Developers Kotlin curriculum. 

This app demonstrates the following views and techniques:

* [Retrofit](https://square.github.io/retrofit/) to make api calls to an HTTP web service.
* [Moshi](https://github.com/square/moshi) which handles the deserialization of the returned JSON to Kotlin data objects. 
* [Glide](https://bumptech.github.io/glide/) to load and cache images by URL.
* [Room](https://developer.android.com/training/data-storage/room) for local database storage.
  
It leverages the following components from the Jetpack library:

* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
* [Data Binding](https://developer.android.com/topic/libraries/data-binding/) with binding adapters
* [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) with the SafeArgs plugin for parameter passing between fragments


## Setting up the Repository

To get started with this project, simply pull the repository and import the project into Android Studio. From there, deploy the project to an emulator or device. 

* NOTE: In order for this project to pull data, you will need to add your API Key to the project as a value in the CivicsHttpClient. You can generate an API Key from the [Google Developers Console](https://console.developers.google.com/)

## Getting Started

* For the most part, the TODOs in the project will guide you through getting the project completed. There is a general package architecture and *most* files are present. 
* Hints are provided for tricky parts of the application that may extend beyond basic Android development skills.
* As databinding is integral to the project architecture, it is important to be familiar with the IDE features such s cleaning and rebuilding the project as well as invalidating caches. 

## Suggested Workflow

* It is recommend you save all beautification until the end of the project. Ensure functionality first, then clean up UI. While UI is a component of the application, it is best to deliver a functional product.
* Start by getting all screens in the application to navigate to each other, even with dummy data. If needed, comment out stub code to get the application to compile. You will need to create actions in *nav_graph.xml* and UI elements to trigger the navigation. 
* Create an API key and begin work on the Elections Fragment  and associated ViewModel. 
	* Use the elections endpoint in the Civics API and requires no parameters.
	* You will need to create a file to complete the step.
	* This will require edits to the Manifest.
	* Link the election to the Voter Info Fragment.
* Begin work on the Voter Info Fragment and associated ViewModel.
* Begin work on the Representative Fragment and associated ViewModel.
	* This will require edits to Gradle.
	* You will need to create a file to complete the step.



## Report Issues
Notice any issues with a repository? Please file a github issue in the repository.
![](./screenshots/Github-Visualizer-App.png)

# Github Visualizer
### 📲 Android Application to track any user activity on Github built using the Github Developers Api. A sample application to demonstrate how to use Jetpack Architecture Components in an Android Application following the Clean MVVM Architecture concepts. 

[![License](https://img.shields.io/badge/license-MIT-%2397ca00.svg)](https://github.com/dheerajkotwani/GithubVisualizer/blob/master/LICENSE.txt)
![UI Library shield](https://img.shields.io/badge/LibraryType-UI-blue.svg)
![Sample App shield](https://img.shields.io/badge/App-Sample-green.svg)
![Artifact badge local, or jcenter or clonerepo](https://img.shields.io/badge/Artifact-JCenter-green.svg)
![Minimum API Level](https://img.shields.io/badge/Min%20API%20Level-21-green)
![Maximum API Level](https://img.shields.io/badge/Max%20API%20Level-29-orange)
![GitHub repo size](https://img.shields.io/github/repo-size/dheerajkotwani/GithubVisualizer)


<a href='https://play.google.com/store/apps/details?id=project.dheeraj.githubvisualizer'><img align='center' height='85' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png'></a>

## 🚀 Features
- Explore all Feeds at one place.
- Get list for latest notification.
- Get details of all the issues and pull request.
- Easy access to all your repositories.
- Search for users in one go.
- Follow or unfollow any user.
- Get list of all the Starred repositories of you as well as any other user.
- Get all data of any user
- Mutliple methods to share data from users and repositories.
- Clean MVVM Architecture.

## ⚙ Tech used
- Github Api
- Kotlin
- Model-View-Viewmodel Architecture
- Navigation component
- Room database
- Retrofit 2
- GSON
- Glide
- Firebase Analytics
- Firebase Auth

## 📷 Screenshots
<img src ="./screenshots/screenshot_1.png" width="260" />&nbsp;&nbsp;<img src ="./screenshots/screenshot_1(1).png" width="260" />
<img src ="./screenshots/screenshot_2.png" width="260" />&nbsp;&nbsp;<img src ="./screenshots/screenshot_2(1).png" width="260" />
<img src ="./screenshots/screenshot_3.png" width="260" />&nbsp;&nbsp;<img src ="./screenshots/screenshot_3(1).png" width="260" />

## 🎯 Requirements
- Android 5.0 and Above
- Min sdk version 21

## 💻 Permissions
- Internet

## 💲 Donate
##### If you like the project and wanna support me develop new stuff, You can buy me a coffee.
<a href="https://www.buymeacoffee.com/dheerajkotwani" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-orange.png" alt="Buy Me A Coffee" align='center' height='60'></a>


## 📝 License

```
MIT License

Copyright (c) 2020 Dheeraj Kotwani

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```




