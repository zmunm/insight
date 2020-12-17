plugins {
    `android-library`
    `kotlin-android`
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(30)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}