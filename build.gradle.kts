plugins {
    id("java")
    kotlin("jvm") version "1.9.22"
}

group = "com.ix8oio8xi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.antlr:antlr4-runtime:4.13.1")
    implementation(kotlin("stdlib-jdk8"))

    implementation("ch.qos.logback:logback-classic:1.4.11")
    implementation("guru.nidi:graphviz-java-all-j2v8:0.18.1")

    implementation("com.eclipsesource.j2v8:j2v8_linux_x86_64:4.6.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}