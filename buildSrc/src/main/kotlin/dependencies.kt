@file:Suppress("unused")

object Versions {
    val kotlinVersion = "1.3.11"
    val kotlinCoroutineVersion = "1.1.0"
    val ktorVersion = "1.1.1"
    val frontendPluginVersion = "0.0.33"
    val serializationRuntimeVersion = "0.9.1"

    val androidPluginVersion = "3.2.1"
    val junitVersion = "4.12"
}

object KotlinCommonLib {
    val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-common"
    val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serializationRuntimeVersion}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.kotlinCoroutineVersion}"
    val KtorClientCore = "io.ktor:ktor-client-core:${Versions.ktorVersion}"

    val testAnnotation = "org.jetbrains.kotlin:kotlin-test-annotations-common"
    val testCommon = "org.jetbrains.kotlin:kotlin-test-common"
}

object KotlinJvmLib {
    val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    val serializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serializationRuntimeVersion}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutineVersion}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutineVersion}"
    val ktorClientAndroid = "io.ktor:ktor-client-android:${Versions.ktorVersion}"

    val testJUnit = "junit:junit:${Versions.junitVersion}"
    val testKotlin = "org.jetbrains.kotlin:kotlin-test"
    val testKotlinJUnit = "org.jetbrains.kotlin:kotlin-test-junit"
}

object KotlinNativeLib {
    val serializationRuntime = "org.jetbrains.kotlinx:jsonparser-native:${Versions.serializationRuntimeVersion}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.kotlinCoroutineVersion}"
    val ktorClientIos = "io.ktor:ktor-client-ios:${Versions.ktorVersion}"
}

object KotlinJs {
    val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-js"
    val testKotlin = "org.jetbrains.kotlin:kotlin-test-js"
}

object KotlinTestLib {
    val common = "org.jetbrains.kotlin:kotlin-test-common"
    val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common"
}