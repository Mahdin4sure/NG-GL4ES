plugins {
    id("com.android.library") version "8.13.2"
}

android {
    namespace = "com.bzlzhh.ng_gl4es"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
    }

    lint {
        targetSdk = 34
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    externalNativeBuild {
        cmake {
            path = file("CMakeLists.txt")
        }
    }

    ndkVersion = "27.0.12077973"
}
