plugins {
    com.android.library
    `kotlin-android`
    jacoco
    detekt
    document
}

android.defaultSetting()

dependencies {
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)
    implementation(Dependency.KOTEST)
    implementation(Dependency.MOCKK)
    implementation(Dependency.COROUTINE_TEST)
    implementation(Dependency.MOCK_WEBSERVER)
}
