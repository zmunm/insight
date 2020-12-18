plugins {
    kotlin
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(group = "javax.inject", name = "javax.inject", version = "1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2")
}
