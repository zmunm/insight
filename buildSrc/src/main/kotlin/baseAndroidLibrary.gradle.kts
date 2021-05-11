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
