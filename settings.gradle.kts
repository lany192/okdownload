pluginManagement {
    repositories {
        maven {
            setUrl("https://mirrors.tencent.com/nexus/repository/maven-public/")
        }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            setUrl("https://mirrors.tencent.com/nexus/repository/maven-public/")
        }
        google()
        mavenCentral()
    }
}


rootProject.name = "okdownload-demo"
include("sample")
include(":okdownload")
include(":okdownload-process")
include(":okdownload-connection-okhttp")
include(":okdownload-breakpoint-sqlite")
include(":okdownload-kotlin-enhance")
include(":okdownload-filedownloader")