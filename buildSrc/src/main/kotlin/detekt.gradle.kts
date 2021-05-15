plugins {
    id("io.gitlab.arturbosch.detekt")
}

detekt {
    buildUponDefaultConfig = true
    allRules = true
    input = files(
        "$projectDir/src/main/",
        "$projectDir/src/test/",
        "$projectDir/build.gradle.kts"
    )
    autoCorrect = true
    config = files(
        "${rootProject.projectDir}/detekt.yml"
    )
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.17.0")
}
