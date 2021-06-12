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

    implementation(Dependency.ROOM_RUNTIME)
    implementation(Dependency.ROOM_KTX)
    kapt(Dependency.ROOM_COMPILER)

    implementation(Dependency.MOSHI)
    kapt(Dependency.MOSHI_APT)

    implementation(Dependency.TIMBER)

    testImplementation(project(":cache:verifier"))
}
