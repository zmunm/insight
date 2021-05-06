import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    id("com.android.application")
    `kotlin-android`
    `kotlin-kapt`
    id("dagger.hilt.android.plugin")
    detekt
    document
}
val rawgKey: String = gradleLocalProperties(rootDir).getProperty("rawg_key")

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "io.github.zmunm.insight"
        minSdkVersion(24)
        targetSdkVersion(30)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        versionCode = 1
        versionName = "1.0"

        buildConfigField("String", "RAWG_KEY", rawgKey)
    }

    buildFeatures {
        dataBinding = true
    }

    flavorDimensions(
        Dimension.Remote.NAME,
        Dimension.Local.NAME
    )

    productFlavors {
        Dimension.Remote.Retrofit { create(it.flavor) { dimension(it.dimension) } }
        Dimension.Remote.Ktor { create(it.flavor) { dimension(it.dimension) } }
        Dimension.Local.Room { create(it.flavor) { dimension(it.dimension) } }
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

    packagingOptions {
        exclude("DebugProbesKt.bin")
    }
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets {
        configureEach {
            noAndroidSdkLink.set(false)
        }
    }
}

dependencies {
    implementation(project(":entity"))
    implementation(project(":usecase"))
    implementation(project(":repository"))

    Dimension.Remote.Retrofit.implement(project(":service:remote:retrofit"))
    Dimension.Remote.Ktor.implement(project(":service:remote:retrofit"))
    Dimension.Local.Room.implement(project(":service:local:room"))

    implementation(Dependency.ANDROID_STARTUP)
    implementation(Dependency.ANDROID_KTX)
    implementation(Dependency.ANDROID_FRAGMENT_KTX)
    implementation(Dependency.ANDROID_APPCOMPAT)
    implementation(Dependency.ANDROID_MATERIAL)
    implementation(Dependency.ANDROID_CONSTRAINT)
    implementation(Dependency.ANDROID_SWIPE_REFRESH)

    implementation(Dependency.LIFECYCLE)
    implementation(Dependency.LIFECYCLE_LIVEDATA)
    implementation(Dependency.LIFECYCLE_VIEWMODEL)
    implementation(Dependency.LIFECYCLE_SAVED_STATE)

    implementation(Dependency.HILT)
    kapt(Dependency.HILT_APT)

    implementation(Dependency.COROUTINE)

    implementation(Dependency.PAGING)

    implementation(Dependency.GLIDE)
    kapt(Dependency.GLIDE_APT)

    implementation(Dependency.TIMBER)

    testImplementation(Dependency.JUNIT)
}
