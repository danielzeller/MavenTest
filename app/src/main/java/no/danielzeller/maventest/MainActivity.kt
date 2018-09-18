package no.danielzeller.maventest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import no.danielzeller.maventestlibrary.TestView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yo = TestView(this)
    }
}
