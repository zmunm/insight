plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))

    implementation("com.google.dagger:dagger:2.30.1")
    implementation("com.google.dagger:hilt-android:2.30.1-alpha")
    kapt("com.google.dagger:dagger-compiler:2.30.1")
    kapt("com.google.dagger:hilt-android-compiler:2.30.1-alpha")
}