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

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.KTOR_ANDROID)
    implementation(Dependency.KTOR_CIO)
    implementation(Dependency.KTOR_SERIALIZATION)

    implementation(Dependency.COROUTINE)

    implementation(Dependency.TIMBER)
}
