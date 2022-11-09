@file:Suppress("UnstableApiUsage")

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.gradle.versions)

    // https://youtrack.jetbrains.com/issue/KT-30276
    alias(libs.plugins.kotlin.jvm) apply false
}

allprojects {
    group = "com.example"
    version = "1.0-SNAPSHOT"
}
