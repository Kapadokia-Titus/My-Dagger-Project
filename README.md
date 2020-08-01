# My-Dagger-Project
Used Dagger, rxjava and Retrofit to make a simple networking call

# Dependecies 
Incase of any issues arising from these dependencies, please copy them to the browser and search for the latest dependencies


    def dagger = "2.23.2"
    implementation "com.google.dagger:dagger-android:$dagger"
    api "com.google.dagger:dagger-android-support:$dagger" // if you use the support libraries
    annotationProcessor "com.google.dagger:dagger-compiler:$dagger"

    def lifecycle_version = "2.2.0"

    // ViewModel
    implementation "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"

    //Retrofit
    def retrofit = "2.6.0"
    implementation "com.squareup.retrofit2:retrofit:$retrofit"
    implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofit"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit"

    //rxjava
    def rxandroid = "2.1.1"
    def rxjava = "2.1.4"
    implementation "io.reactivex.rxjava2:rxandroid:$rxandroid"
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    // (see https://github.com/ReactiveX/RxJava/releases for latest 3.x.x version)
    implementation "io.reactivex.rxjava2:rxjava:$rxjava"
    
   
