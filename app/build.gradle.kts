import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id( "com.android.application")
    id( "org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin") apply false
}

android {
    namespace = "com.arisbartee.moviemarathoner"
    compileSdk =33

    defaultConfig {
        applicationId = "com.arisbartee.moviemarathoner"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildToolsVersion = "31.0.0"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles( getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.8"
    }
    packagingOptions {
        // Multiple dependency bring these files in. Exclude them to enable
        // our test APK to build (has no effect on our AARs)
        resources.excludes += "/META-INF/AL2.0"
        resources.excludes += "/META-INF/LGPL2.1"
    }
}

androidComponents {
    onVariants(selector().withBuildType("release")) {
        // Only exclude *.version files in release mode as debug mode requires
        // these files for layout inspector to work.
        it.packaging.resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {


    implementation(libs.androidx.core.ktx)
    implementation( libs.androidx.lifecycle.runtime.ktx)
    implementation( libs.androidx.activity.compose)
    implementation( libs.androidx.navigation.compose)
    implementation( platform( libs.androidx.compose.bom ))
    implementation( libs.androidx.compose.ui)
    implementation( libs.androidx.compose.ui)
    implementation( libs.androidx.compose.ui.tooling.preview)
    implementation( libs.androidx.compose.material3)
    implementation( libs.hilt.android)
    kapt( libs.hilt.android.compiler)
    implementation( libs.hilt.nav.compose)
    testImplementation( libs.junit )
    androidTestImplementation( libs.androidx.test.ext.junit)
    androidTestImplementation( libs.androidx.test.espresso.core)
    androidTestImplementation( platform( libs.androidx.compose.bom ))
    androidTestImplementation( libs.androidx.compose.test.junit4)
    debugImplementation( libs.androidx.compose.ui.tooling )
    debugImplementation( libs.androidx.compose.ui.test.manifest )
}