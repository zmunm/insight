plugins {
    jacoco
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<JacocoReport> {
    dependsOn(tasks.withType<Test>())
    reports {
        html.isEnabled = true
    }
}

dependencies {
    "testImplementation"(Dependency.KOTEST)
    "testImplementation"(Dependency.MOCKK)
    "testImplementation"(Dependency.COROUTINE_TEST)
}