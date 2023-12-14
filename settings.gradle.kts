pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


rootProject.name = "okdownload-root"

include(":okdownload")
include(":process")
include(":okhttp")
include(":sqlite")
include(":kotlin")
include(":benchmark")
include(":filedownloader")
include("sample")

project(":process").projectDir = File(settingsDir, "okdownload-process")
project(":okhttp").projectDir = File (settingsDir, "okdownload-connection-okhttp")
project(":sqlite").projectDir = File (settingsDir, "okdownload-breakpoint-sqlite")
project(":kotlin").projectDir = File (settingsDir, "okdownload-kotlin-enhance")
project(":filedownloader").projectDir = File (settingsDir, "okdownload-filedownloader")
