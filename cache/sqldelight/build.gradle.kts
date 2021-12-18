plugins {
    com.android.library
    `kotlin-android`
    `kotlin-kapt`
    id("com.squareup.sqldelight")
    `testing-android`
    detekt
    document
}

android.defaultSetting()

sqldelight {
    database("DelightDatabase") {
        packageName = "io.github.zmunm.insight"
        schemaOutputDirectory = file("build/dbs")
    }
    linkSqlite = false
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":repository"))

    implementation(Dependency.COROUTINE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.SQLDELIGHT_ANDROID)
    implementation(Dependency.SQLDELIGHT_COROUTINE)

    implementation(Dependency.TIMBER)

    testImplementation(project(":cache:verifier"))
    testImplementation(Dependency.SQLDELIGHT_SQLITE)
}
