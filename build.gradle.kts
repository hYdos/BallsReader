plugins {
    java
    antlr
}

group = "me.hydos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.9.3")
    implementation("org.antlr:antlr4-runtime:4.9.3")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    source = sourceSets["main"].antlr

    outputDirectory = file("src/main/java/me/hydos/antlr")
}

tasks.clean {

    doLast {
        file("generated-src").delete()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
