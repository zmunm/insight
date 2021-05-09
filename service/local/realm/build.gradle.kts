plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    `realm-android`
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))
    implementation(project(":repository"))

    implementation(Dependency.ANDROID_STARTUP)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.COROUTINE)

    implementation(Dependency.TIMBER)
}
