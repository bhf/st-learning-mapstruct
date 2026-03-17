plugins {
    `java`
    application
}

group = "com.bhf.learning"
version = "0.1.0"

repositories {
    mavenCentral()
}


dependencies {
    implementation(libs.mapstruct)
    annotationProcessor(libs.mapstruct.processor)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}

application {
    mainClass.set("com.bhf.learning.mapstruct.basic.Main")
}

// Ensure annotation processor path is set for the compile task
tasks.withType<JavaCompile> {
    options.annotationProcessorPath = configurations.annotationProcessor.get()
}

// Use JUnit Platform for JUnit 5
tasks.test {
    useJUnitPlatform()
}
