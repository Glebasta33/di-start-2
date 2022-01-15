package com.trusov.mydependencyinjectionstart.example1

class Activity {

    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}