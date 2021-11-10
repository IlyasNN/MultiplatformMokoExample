package com.example.mokomvvmexample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}