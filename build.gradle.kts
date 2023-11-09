plugins {
    kotlin("jvm") version "1.9.20"
    java
}

group = "com.runarmc.eventbus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.0")
    implementation("com.google.guava:guava:17.0")
}

kotlin {
    jvmToolchain(8)
}