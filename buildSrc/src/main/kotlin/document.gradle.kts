import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    id("org.jetbrains.dokka")
}

dependencies {
    dokkaJekyllPlugin("org.jetbrains.dokka:jekyll-plugin:1.4.32")
}

tasks.withType<DokkaTask> {
    outputDirectory.set(rootDir.resolve("docs/pages/kdoc/${project.name}"))
}

// don't work well
tasks.withType<DokkaMultiModuleTask> {
    outputDirectory.set(rootDir.resolve("dokkaCustomMultiModuleOutput"))
}