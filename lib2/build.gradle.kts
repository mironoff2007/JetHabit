
plugins {
    kotlin("multiplatform")
    id("org.jetbrains.kotlin.jvm") apply false
}

version = "1.0-SNAPSHOT"

kotlin {
    jvm("desktop")

    ios()
    iosSimulatorArm64()

    js(IR) {
        browser()
    }

    macosX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    macosArm64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":lib"))
            }
        }
    }
}
