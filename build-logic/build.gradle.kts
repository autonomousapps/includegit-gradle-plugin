plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.asciidoctor:asciidoctor-gradle-jvm:3.3.2")
    // implementation("org.ajoberstar:gradle-git-publish:3.0.0")
    implementation("org.ajoberstar.git-publish:gradle-git-publish:5.1.1")
}
