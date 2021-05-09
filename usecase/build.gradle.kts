plugins {
    kotlin
    testing
    detekt
    document
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        html.isEnabled = true
    }
}

dependencies {
    implementation(project(":entity"))
    implementation(group = "javax.inject", name = "javax.inject", version = "1")
    implementation(Dependency.COROUTINE)
}
