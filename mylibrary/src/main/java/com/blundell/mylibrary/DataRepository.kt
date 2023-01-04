package com.blundell.mylibrary

import android.util.Log

/**
 * An example class that can have it's log message changed to represent a code change
 */
object DataRepository {

    fun fetchDroidMessage() : String {
        Log.d("TUT", "Fetching...")
        return "Hello Android World"
    }

}