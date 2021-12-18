plugins {
    com.android.library
    `kotlin-android`
    `kotlin-kapt`
    `realm-android`
    `testing-android`
    detekt
    document
}

android.defaultSetting()

dependencies {
    implementation(project(":domain"))
    implementation(project(":repository"))

    implementation(Dependency.ANDROID_STARTUP)

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.TIMBER)

    testImplementation(project(":cache:verifier"))
}
