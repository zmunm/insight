plugins {
    baseAndroidLibrary
    jacoco
    detekt
    document
}

dependencies {
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)
    implementation(Dependency.KOTEST)
    implementation(Dependency.MOCKK)
    implementation(Dependency.COROUTINE_TEST)
    implementation(Dependency.MOCK_WEBSERVER)
}
