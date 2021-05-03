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
    const val ANDROID_TOOL = "4.1.3"
    const val KOTLIN = "1.4.20"
    const val DOKKA = "1.4.10"
    const val VERSIONING = "0.36.0"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersion.ANDROID_TOOL}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("org.jetbrains.kotlin:kotlin-serialization:${PluginVersion.KOTLIN}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.16.0")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${PluginVersion.DOKKA}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${PluginVersion.VERSIONING}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.31.2-alpha")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
}