plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    `testing-android`
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.RETROFIT)
    implementation(Dependency.RETROFIT_MOSHI)
    implementation(Dependency.RETROFIT_INTERCEPTOR)

    implementation(Dependency.MOSHI)
    kapt(Dependency.MOSHI_APT)

    implementation(Dependency.TIMBER)

    testImplementation(project(":service:verifier"))
}
