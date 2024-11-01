# EduExplorer 🎓

EduExplorer is an Android application that helps users discover universities worldwide. Using a clean and intuitive interface, users can search for universities by country and access detailed information about educational institutions globally.

![Minimum SDK](https://img.shields.io/badge/Min%20SDK-API%2024-green)
![Kotlin](https://img.shields.io/badge/Kotlin-1.8.0-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## Features ✨

- **Country-based Search**: Easily find universities by entering a country name
- **Detailed Information**: Access comprehensive details about each university
- **Interactive UI**: Modern Material Design interface with smooth animations
- **Website Integration**: Direct links to university websites
- **Offline Support**: Data persistence for seamless user experience
- **Responsive Design**: Adapts to different screen sizes and orientations

## Screenshots 📱

[Place screenshots here]

## Technical Stack 🛠

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Dependencies**:
  - Retrofit2 for API calls
  - Coroutines for asynchronous operations
  - LiveData for reactive data handling
  - ViewModel for lifecycle management
  - Material Design Components
  - Navigation Component
  - ViewBinding for view interaction

## Setup & Installation 📥

1. Clone the repository:
```bash
git clone https://github.com/qharny/EduExplorer.git
```

2. Open the project in Android Studio

3. Sync project with Gradle files

4. Run the app on an emulator or physical device

## API Integration 🌐

The app uses the Universities API (http://universities.hipolabs.com) to fetch university data. The API provides information such as:
- University name
- Country
- State/Province
- Domains
- Web pages

## Project Structure 📂

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/eduexplorer/
│   │   │   ├── data/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   └── api/
│   │   │   ├── ui/
│   │   │   │   ├── adapter/
│   │   │   │   ├── viewmodel/
│   │   │   │   └── activity/
│   │   │   └── util/
│   │   └── res/
│   │       ├── layout/
│   │       ├── values/
│   │       └── drawable/
│   └── test/
└── build.gradle
```

## Architecture 🏗

The app follows the MVVM (Model-View-ViewModel) architecture pattern:

- **Model**: Represents the data and business logic
- **View**: UI elements (Activities/Fragments)
- **ViewModel**: Manages UI-related data and business logic

## Contributing 🤝

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/YourFeature`
3. Commit changes: `git commit -m 'Add YourFeature'`
4. Push to branch: `git push origin feature/YourFeature`
5. Submit a Pull Request

## License 📄

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments 🙏

- Universities API for providing the data
- Material Design for UI components
- Open source community for various libraries used

## Contact 📧

- Project Link: [https://github.com/Qharny/EduExplorer](https://github.com/qharny/EduExplorer)
- Developer Email: your.email@example.com

## Future Enhancements 🚀

- [ ] Add favorites functionality
- [ ] Implement advanced filtering options
- [ ] Add university comparison feature
- [ ] Include user reviews and ratings
- [ ] Implement dark mode
- [ ] Add multilanguage support
- [ ] Integrate maps for university locations
- [ ] Add share functionality

---

Made with ❤️ by Kabutey Manasseh Kwame