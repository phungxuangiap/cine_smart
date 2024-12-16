package com.example.cinesmart.Viewmodels

import androidx.lifecycle.ViewModel

class SelectFilmViewModel:ViewModel() {
    fun getData(){

    }
}


// Given request.path == /example/hello/nested/path the following
// declarations indicate whether they are a partial or complete match and
// the value of any variables visible within the scope.
//service firebase.storage {
//    match /example/{singleSegment} {
//        allow write
//        match /nested/path {
//            allow read
//        }
//    }
//
//    match /example/{multiSegment=**} {
//        allow read
//    }
//}