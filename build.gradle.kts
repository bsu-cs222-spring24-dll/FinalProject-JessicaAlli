plugins {
    id("java")
    id("org.openjfx.javafxplugin") version "0.0.10"

    id ("application")
}

group = "edu.bsu.cs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    implementation("org.openjfx:javafx-base:17.0.2:linux")
    implementation("org.openjfx:javafx-graphics:17.0.2:linux")
    implementation("org.openjfx:javafx-controls:17.0.2:linux")
    implementation("org.openjfx:javafx-fxml:17.0.2:linux")

}

tasks.test {
    useJUnitPlatform()
}
javafx {
    version = "17.0.2"
    modules("javafx.controls", "javafx.fxml")
}
