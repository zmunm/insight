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

    implementation(Dependency.ROOM_RUNTIME)
    implementation(Dependency.ROOM_KTX)
    kapt(Dependency.ROOM_COMPILER)

    implementation(Dependency.TIMBER)
}
