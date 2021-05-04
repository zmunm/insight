plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.PAGING)
}
