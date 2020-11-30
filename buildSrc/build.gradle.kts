plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
}

object PluginVersion {
    const val ANDROID_TOOL = "4.1.1"
    const val KOTLIN = "1.4.20"
    const val DOKKA = "0.10.1"
    const val VERSIONING = "0.29.0"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersion.ANDROID_TOOL}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.14.2")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${PluginVersion.DOKKA}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${PluginVersion.VERSIONING}")
}