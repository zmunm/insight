plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    `testing-android`
    detekt
    document
}

dependencies {
    implementation(project(":domain"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.TIMBER)
}
