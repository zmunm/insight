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
    kapt("com.google.dagger:hilt-android-compiler:2.30.1-alpha")

    implementation("androidx.paging:paging-runtime:3.0.0-alpha11")
}
