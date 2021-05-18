plugins {
    jacoco
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.register<JacocoReport>("jacocoTestReport") {
    dependsOn("testDebugUnitTest")
    val classFiles = fileTree("$buildDir/tmp/kotlin-classes/debug")
    val sourceFiles = files(listOf("src/main/java"))
    val executionFile = fileTree(buildDir) {
        include("jacoco/testDebugUnitTest.exec")
    }
    reports {
        html.isEnabled = true
    }
    classDirectories.from(classFiles)
    sourceDirectories.from(sourceFiles)
    executionData.from(executionFile)
}

dependencies {
    "testImplementation"(Dependency.KOTEST)
    "testImplementation"(Dependency.MOCKK)
    "testImplementation"(Dependency.COROUTINE_TEST)
}