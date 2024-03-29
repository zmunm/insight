plugins {
    com.android.library
    `kotlin-android`
    `kotlin-kapt`
    `testing-android`
    detekt
    document
}

android.defaultSetting()

dependencies {
    implementation(project(":domain"))
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.VOLLEY)

    implementation(Dependency.GSON)

    implementation(Dependency.TIMBER)

    testImplementation(project(":service:verifier"))
    testImplementation(Dependency.KOTEST_ROBOLECTRIC)
    testImplementation(Dependency.ANDROID_TEST)
    testImplementation(Dependency.ROBOLECTRIC)
}
