pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = ("com.ncorti.kotlin.gradle.template")

include(":test")
include(":plugin")
