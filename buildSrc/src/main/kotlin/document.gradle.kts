import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    id("org.jetbrains.dokka")
}

dependencies {
    dokkaJekyllPlugin("org.jetbrains.dokka:jekyll-plugin")
}

tasks.withType<DokkaTask>().configureEach {
    outputDirectory.set(rootDir.resolve("docs/pages/kdoc"))
}

// don't work well
tasks.withType<DokkaMultiModuleTask>().configureEach {
    outputDirectory.set(rootDir.resolve("dokkaCustomMultiModuleOutput"))
}