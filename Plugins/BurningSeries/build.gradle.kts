plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jsoup:jsoup:1.15.3")
    // Die CloudStream-Core-Bibliothek - stelle sicher, dass die Version passt
    implementation("com.lagradost.cloudstream3:core:3.1.0")
}
