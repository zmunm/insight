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

    implementation("com.google.dagger:dagger:2.30.1")
    implementation("com.google.dagger:hilt-android:2.30.1-alpha")
    kapt("com.google.dagger:hilt-android-compiler:2.30.1-alpha")

    implementation("io.ktor:ktor-client-android:1.4.1")
    implementation("io.ktor:ktor-client-cio:1.4.1")
    implementation("io.ktor:ktor-client-serialization-jvm:1.4.1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2")

    implementation("androidx.paging:paging-runtime:3.0.0-alpha11")

    implementation("com.orhanobut:logger:2.2.0")
}
