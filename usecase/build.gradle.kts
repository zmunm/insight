plugins {
    kotlin
    detekt
    document
}

dependencies {
    implementation(project(":entity"))
    implementation(group = "javax.inject", name = "javax.inject", version = "1")
}