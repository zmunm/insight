plugins {
    baseAndroidLibrary
    `kotlin-kapt`
    id("com.squareup.sqldelight")
    `testing-android`
    detekt
    document
}

sqldelight {
    database("DelightDatabase") {
        packageName = "io.github.zmunm.insight"
        schemaOutputDirectory = file("build/dbs")
    }
    linkSqlite = false
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.SQLDELIGHT_ANDROID)
    implementation(Dependency.SQLDELIGHT_COROUTINE)

    implementation(Dependency.TIMBER)

    testImplementation(Dependency.SQLDELIGHT_SQLITE)
}
