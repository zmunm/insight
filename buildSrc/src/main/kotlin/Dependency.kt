object Dependency {
    const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"

    const val TIMBER = "com.jakewharton.timber:timber:5.0.1"

    const val HILT = "com.google.dagger:hilt-android:2.40.5"
    const val HILT_APT = "com.google.dagger:hilt-android-compiler:2.40.5"

    // region data source
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
    const val RETROFIT_MOSHI = "com.squareup.retrofit2:converter-moshi:2.9.0"
    const val RETROFIT_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.3"

    const val MOSHI = "com.squareup.moshi:moshi-kotlin:1.12.0"
    const val MOSHI_ADAPTER = "com.squareup.moshi:moshi-adapters:1.12.0"
    const val MOSHI_APT = "com.squareup.moshi:moshi-kotlin-codegen:1.12.0"

    const val KTOR_ANDROID = "io.ktor:ktor-client-android:1.6.7"
    const val KTOR_CIO = "io.ktor:ktor-client-cio:1.6.7"
    const val KTOR_SERIALIZATION = "io.ktor:ktor-client-serialization-jvm:1.6.7"

    const val VOLLEY = "com.android.volley:volley:1.2.0"

    const val GSON = "com.google.code.gson:gson:2.8.9"

    const val ROOM_RUNTIME = "androidx.room:room-runtime:2.4.0"
    const val ROOM_KTX = "androidx.room:room-ktx:2.4.0"
    const val ROOM_COMPILER = "androidx.room:room-compiler:2.4.0"

    const val SQLDELIGHT_ANDROID = "com.squareup.sqldelight:android-driver:1.5.3"
    const val SQLDELIGHT_COROUTINE = "com.squareup.sqldelight:coroutines-extensions-jvm:1.5.3"
    // endregion

    // region presentation
    const val ANDROID_STARTUP = "androidx.startup:startup-runtime:1.1.0"
    const val ANDROID_KTX = "androidx.core:core-ktx:1.7.0"
    const val ANDROID_FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.4.0"
    const val ANDROID_APPCOMPAT = "androidx.appcompat:appcompat:1.4.0"
    const val ANDROID_MATERIAL = "com.google.android.material:material:1.4.0"
    const val ANDROID_CONSTRAINT = "androidx.constraintlayout:constraintlayout:2.1.2"
    const val ANDROID_SWIPE_REFRESH = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

    const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.0"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    const val LIFECYCLE_SAVED_STATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.4.0"

    const val PAGING = "androidx.paging:paging-runtime-ktx:3.1.0"

    const val GLIDE = "com.github.bumptech.glide:glide:4.12.0"
    const val GLIDE_APT = "com.github.bumptech.glide:compiler:4.12.0"

    const val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:2.7"
    // endregion

    // region test
    const val KOTEST = "io.kotest:kotest-runner-junit5:5.0.2"
    const val KOTEST_ROBOLECTRIC = "io.kotest.extensions:kotest-extensions-robolectric:0.5.0"
    const val MOCKK = "io.mockk:mockk:1.12.1"
    const val COROUTINE_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2"
    const val MOCK_WEBSERVER = "com.squareup.okhttp3:mockwebserver:4.9.3"
    const val ANDROID_TEST = "androidx.test:core:1.4.0"
    const val ROBOLECTRIC = "org.robolectric:robolectric:4.7.3"

    const val SQLDELIGHT_SQLITE = "com.squareup.sqldelight:sqlite-driver:1.5.3"
    // endregion
}