plugins {
    kotlin
    testing
    detekt
    document
}

dependencies {
    implementation(group = "javax.inject", name = "javax.inject", version = "1")
    implementation(Dependency.COROUTINE)
}
