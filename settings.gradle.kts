pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "frontend"

//group("com.example")
//version '0.0.1'
//
//apply plugin: 'maven-publish'


include("mpp")

enableFeaturePreview("GRADLE_METADATA")
