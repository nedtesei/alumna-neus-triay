plugins {
    application
}

repositories {
    mavenCentral()
}

subprojects {

    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.2"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    tasks.test {
        useJUnitPlatform()
    }
}

// Config específica del módulo CLI
project(":cli") {
    apply(plugin = "application")

    application {
        mainClass = "cli.CliApp"
    }
}

// Tarea personalizada
tasks.register("printModules") {
    group = "help"
    description = "Imprime los módulos del proyecto"

    doLast {
        println("=== MODULOS ===")
        rootProject.subprojects.forEach { sub ->
            val type = when(sub.name) {
                "core" -> "Core (java-library)"
                "api"  -> "API  (java-library)"
                "cli"  -> "CLI  (application)"
                else   -> "Otro"
            }
            println("- ${sub.path} -> $type")
        }
    }
}
