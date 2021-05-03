plugins {
    baseAndroidLibrary
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

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")

    implementation("com.squareup.moshi:moshi-kotlin:1.12.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")

    implementation("androidx.paging:paging-runtime:3.0.0-rc01")

    implementation("com.orhanobut:logger:2.2.0")
}
