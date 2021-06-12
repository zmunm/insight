plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    `testing-android`
    detekt
    document
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.RETROFIT)
    implementation(Dependency.RETROFIT_MOSHI)
    implementation(Dependency.RETROFIT_INTERCEPTOR)

    implementation(Dependency.MOSHI)
    implementation(Dependency.MOSHI_ADAPTER)
    kapt(Dependency.MOSHI_APT)

    implementation(Dependency.TIMBER)

    testImplementation(project(":service:verifier"))
}
