
plugins {
    id("com.android.application")
}

android {
    namespace = "com.elfilibustero.uidesigner"
    compileSdk = 34
    
    defaultConfig {
        applicationId = "com.elfilibustero.uidesigner"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {

    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.activity:activity:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.blankj:utilcodex:1.31.1")
    implementation("com.google.guava:guava:33.0.0-jre")
}
