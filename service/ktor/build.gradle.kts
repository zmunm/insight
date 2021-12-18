plugins {
    com.android.library
    `kotlin-android`
    `kotlinx-serialization`
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

    implementation(Dependency.KTOR_ANDROID)
    implementation(Dependency.KTOR_CIO)
    implementation(Dependency.KTOR_SERIALIZATION)

    implementation(Dependency.TIMBER)

    testImplementation(project(":service:verifier"))
}
