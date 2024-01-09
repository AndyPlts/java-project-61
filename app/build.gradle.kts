plugins {
    id("java")
    id("se.patrikerdes.use-latest-versions") version "0.2.18"
    id("com.github.ben-manes.versions") version "0.50.0"
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
    }

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    }

tasks {
    compileJava {
        options.release = 20
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}