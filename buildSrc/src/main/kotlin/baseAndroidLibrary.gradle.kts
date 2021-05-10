import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    `android-library`
    `kotlin-android`
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(30)
    }

    testOptions {
        unitTests {
            all {
                it.useJUnitPlatform()
                it.testLogging {
                    events("passed", "skipped", "failed")
                    it.outputs.upToDateWhen {
                        false
                    }
                    // test jvm의 standard out and standard error을 console에 출력한다.
                    showStandardStreams = true
                    showCauses = true
                    showExceptions = true
                    showStackTraces = true
                    exceptionFormat = TestExceptionFormat.FULL
                }
            }
        }
    }
}