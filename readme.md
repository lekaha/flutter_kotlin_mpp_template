# Flutter and Kotlin Multiple Platform project template

## Project Structure


```
projectRoot/
  common/
    Common/		# Shared code not relevant to any platforms
	iOS/		# Implementation of platform code for iOS
	Android/	# Implementation of platform code for Android
  iOSApp/		# iOS application
  AndroidApp/	# Android application
```

## Modules

- Root module
- AndroidApp module
- Common module

### Common Gradle module


```
kotlin {
    targets {
        fromPreset(presets.android, 'android')
        // This preset is for iPhone emulator
        // Switch here to presets.iosArm64 (or iosArm32) to build library for iPhone device
        fromPreset(presets.iosX64, 'ios') {
            compilations.main.outputKinds('FRAMEWORK')
        }
    }
	...
}	
```

## Future work


Now it begins from building mobild application (Android and iOS). In the project, it is still needed to build web application. 
