package com.trusov.mydependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()

}