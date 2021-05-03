plugins {
    id("io.gitlab.arturbosch.detekt")
}

detekt {
    failFast = true
    input = files("$projectDir/src/main/", "$projectDir/build.gradle.kts")
    autoCorrect = true
    config = files(
        "${rootProject.projectDir}/detekt.yml"
    )
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.16.0")
}
