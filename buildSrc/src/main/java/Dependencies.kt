object Versions {
    //Support Version
    val kotlin = "1.3.61"
    val constraint_layout = "1.1.3"
    val appCompat = "1.1.0"
    val core_ktx = "1.1.0"

    val android_gradle_version = "3.5.3"

    //Testing Version
    val junit = "4.12"
    val junit_ext = "1.1.1"
    val espresso_core = "3.2.0"

    //UI Utils Version
    val card_view = "1.0.0"
    val recycler_view = "1.1.0"
    val shimmer_layout = "2.1.0"

    //Arch Components
    val lifecycle = "2.2.0"
    val room = "2.2.3"

    //Networking Version
    val retrofit = "2.7.1"
    val okhttp = "4.3.1"

    //Package Version
    val min_sdk = 21
    val target_sdk = 29
    val compile_sdk = 29
    val version_code = 1
    val version_name = "1.0"
    val build_tools_version = "29.0.2"
}

object Deps {
    // Support Library
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val app_compat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    // Testing
    val junit = "junit:junit:${Versions.junit}"
    val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"

    //UI elements
    val card_view = "androidx.cardview:cardview:${Versions.card_view}"
    val recycler_view = "androidx.recyclerview:recyclerview:${Versions.recycler_view}"
    val shimmer_layout = "io.supercharge:shimmerlayout:${Versions.shimmer_layout}"


    //Arch Components
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val room = "androidx.room:room-runtime:${Versions.room}"
    val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    val room_ktx = "androidx.room:room-ktx:${Versions.room}"

    //Networking
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_converter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    //BuildPlugins
     val android_gradle = "com.android.tools.build:gradle:${Versions.android_gradle_version}"
    val kotlin_gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"



}