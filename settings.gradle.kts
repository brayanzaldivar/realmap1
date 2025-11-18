pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // Repositorio de Mapbox para plugins
        maven { url 'https://api.mapbox.com/downloads/v2/releases/maven' }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Repositorio de Mapbox para dependencias
        maven { url 'https://api.mapbox.com/downloads/v2/releases/maven' }
    }
}

rootProject.name = "real app"
include(":app")
