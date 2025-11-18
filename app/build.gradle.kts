plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    namespace 'com.example.realapp'
    compileSdk 34

    defaultConfig {
        externalNativeBuild {
            cmake {
                cppFlags += ""
            }
        }
        applicationId "com.example.realapp"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"

        // Habilita multidex si tu proyecto crece
        multiDexEnabled true
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
        debug {
            // Para ver logs más fácilmente
            debuggable true
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
                targetCompatibility JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = '17'
    }
    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }

    // Si usas Compose más adelante, lo activamos luego
    // buildFeatures {
    //     compose true
    // }
}

dependencies {

    // MAPBOX SDK (versión recomendada estable)
    implementation 'com.mapbox.maps:android:11.4.0'

    // MultiDex (por si acaso)
    implementation 'androidx.multidex:multidex:2.0.1'

    // Core AndroidX
    implementation 'androidx.core:core-ktx:1.13.1'
    implementation 'androidx.appcompat:appcompat:1.7.0'

    // Material Design
    implementation 'com.google.android.material:material:1.12.0'

    // Para pruebas
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.2.1'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.6.0'
}
