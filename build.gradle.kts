import org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES
import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
    java
    id("org.springframework.boot") version "3.2.6"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.named<BootBuildImage>("bootBuildImage") {
    buildpacks.set(listOf("urn:cnb:builder:paketo-buildpacks/java", "docker.io/paketobuildpacks/new-relic"))
    bindings.set(listOf("${layout.projectDirectory.dir("paketo-bindings")}:/platform/bindings"))
}
