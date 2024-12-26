val kotlinVersion = "1.9.0"

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) version "1.8.20" apply false
    alias(libs.plugins.kotlin.compose) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Update to the latest stable AGP version (e.g., 8.0.0)
        classpath("com.android.tools.build:gradle:8.0.0")

        // Update to the latest Kotlin plugin (e.g., 1.9.0)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }
}