import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    `android-library`
    `kotlin-android`
}

android {
    compileSdkVersion(Version.ANDROID_COMPILE)

    defaultConfig {
        minSdkVersion(Version.ANDROID_MIN)
        targetSdkVersion(Version.ANDROID_TARGET)
    }

    testOptions {
        unitTests {
            all {
                it.useJUnitPlatform()
                it.configure<JacocoTaskExtension> {
                    isIncludeNoLocationClasses = true
                    excludes = listOf("jdk.internal.*")
                }
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
