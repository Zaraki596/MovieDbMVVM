object Versions {
    //Support Version
    const val KOTLIN = "1.3.61"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val APPCOMPAT = "1.1.0"
    const val CORE_KTX = "1.1.0"
    const val ANDROID_GRADLE_VERSION = "3.5.3"

    //Testing Version
    const val JUNIT = "4.12"
    const val JUNIT_EXT = "1.1.1"
    const val ESPRESSO_CORE = "3.2.0"

    //UI Utils Version
    const val CARD_VIEW = "1.0.0"
    const val RECYCLER_VIEW = "1.1.0"
    const val SHIMMER_LAYOUT = "2.1.0"
    const val MATERIAL_DESIGN = "1.2.0-alpha04"

    //Arch Components
    const val LIFECYCLE = "2.2.0"
    const val ROOM = "2.2.3"
    const val PAGING = "2.1.1"

    //Networking Version
    const val RETROFIT = "2.7.1"
    const val OKHTTP = "4.3.1"

    //Package Version
    const val MIN_SDK = 21
    const val TARGET_SDK = 29
    const val COMPILE_SDK = 29
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val BUILD_TOOLS_VERSION = "29.0.2"

    //COROUTINES
    const val COROUTINES = "1.3.3"
    //IMAGE LOADING
    const val COIL = "0.9.2"
}

object Deps {
    // Support Library
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val MATERIAL_DESIGN = "com.google.android.material:material:${Versions.MATERIAL_DESIGN}"

    // Testing
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val JUNIT_EXT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"

    //UI elements
    const val CARD_VIEW = "androidx.cardview:cardview:${Versions.CARD_VIEW}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val SHIMMER_LAYOUT = "io.supercharge:shimmerlayout:${Versions.SHIMMER_LAYOUT}"



    //Arch Components
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
    const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"

    const val PAGING = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"

    //Networking
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"

    //BuildPlugins
     const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_VERSION}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"

    //Coroutines
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    //Coil
    const val COIL_IMAGE_LIB = "io.coil-kt:coil:${Versions.COIL}"



}