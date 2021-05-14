plugins {
    jacoco
}

jacoco {
    toolVersion = "0.8.7"
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
}