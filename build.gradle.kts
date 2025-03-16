plugins {
    kotlin("jvm") version "2.1.10"
}

group = "land.sungbin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
    implementation("com.squareup.okio:okio:3.10.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}