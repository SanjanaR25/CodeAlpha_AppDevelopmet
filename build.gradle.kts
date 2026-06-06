
plugins {
 id 'kotlin-kapt'
//}
//plugins {
   id("com.android.application")
  id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

dependencies {

    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    ksp("androidx.room:room-compiler:2.6.1")

    implementation("androidx.recyclerview:recyclerview:1.3.2")

    implementation("com.google.android.material:material:1.11.0")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
}