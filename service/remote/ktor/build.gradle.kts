plugins {
    baseAndroidLibrary
    `kotlinx-serialization`
    `kotlin-kapt`
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))
    implementation(project(":repository"))

    implementation("com.google.dagger:dagger:2.35.1")
    implementation("com.google.dagger:hilt-android:2.35.1")
    kapt("com.google.dagger:hilt-android-compiler:2.35.1")

    implementation("io.ktor:ktor-client-android:1.5.4")
    implementation("io.ktor:ktor-client-cio:1.5.4")
    implementation("io.ktor:ktor-client-serialization-jvm:1.5.4")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")

    implementation("androidx.paging:paging-runtime:3.0.0-rc01")

    implementation("com.jakewharton.timber:timber:4.7.1")
}
