plugins {
    id("com.android.dynamic-feature")
    `kotlin-android`
    `kotlin-kapt`
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
    detekt
    document
}
android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.2"

    defaultConfig {
        applicationId = "io.github.zmunm.insight.feature.detail"
        minSdkVersion(24)
        targetSdkVersion(30)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    dataBinding.isEnabled = true
}

dependencies {
    implementation(project(":app"))
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation("com.google.dagger:dagger:2.30.1")
    implementation("com.google.dagger:hilt-android:2.30.1-alpha")
    implementation("androidx.hilt:hilt-common:1.0.0-alpha02")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")
    kapt("com.google.dagger:dagger-compiler:2.30.1")
    kapt("com.google.dagger:hilt-android-compiler:2.30.1-alpha")
    kapt("androidx.hilt:hilt-compiler:1.0.0-alpha02")

    testImplementation("junit:junit:4.13.1")
}