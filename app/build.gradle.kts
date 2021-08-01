import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    android
    `kotlin-android`
    `kotlin-kapt`
    `testing-android`
    id("dagger.hilt.android.plugin")
    detekt
}

val rawgKey: String = gradleLocalProperties(rootDir).getProperty(RAWG_KEY)

android {
    compileSdk = Version.ANDROID_COMPILE
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "io.github.zmunm.insight"
        minSdk = Version.ANDROID_MIN
        targetSdk = Version.ANDROID_TARGET
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        versionCode = 1
        versionName = "1.0"

        buildConfigField("String", RAWG_KEY, "\"$rawgKey\"")
    }

    buildFeatures {
        dataBinding = true
    }

    flavorDimensions.addAll(
        listOf(
            Dimension.Service.NAME,
            Dimension.Cache.NAME
        )
    )

    productFlavors {
        Dimension.Service.Retrofit { create(flavor) { dimension = type } }
        Dimension.Service.Volley { create(flavor) { dimension = type } }
        Dimension.Service.Ktor { create(flavor) { dimension = type } }
        Dimension.Cache.Room { create(flavor) { dimension = type } }
        Dimension.Cache.Realm { create(flavor) { dimension = type } }
        Dimension.Cache.SqlDelight { create(flavor) { dimension = type } }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

    testOptions {
        unitTests.all {
            it.useJUnitPlatform()
        }
    }

    packagingOptions {
        resources.excludes.add("DebugProbesKt.bin")
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
    implementation(project(":domain"))
    implementation(project(":repository"))

    Dimension.Service.Retrofit { implement(project(":$type:$flavor")) }
    Dimension.Service.Volley { implement(project(":$type:$flavor")) }
    Dimension.Service.Ktor { implement(project(":$type:$flavor")) }
    Dimension.Cache.Room { implement(project(":$type:$flavor")) }
    Dimension.Cache.Realm { implement(project(":$type:$flavor")) }
    Dimension.Cache.SqlDelight { implement(project(":$type:$flavor")) }

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

    debugImplementation(Dependency.LEAK_CANARY)

    implementation(Dependency.TIMBER)
}
