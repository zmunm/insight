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

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.TIMBER)
}
