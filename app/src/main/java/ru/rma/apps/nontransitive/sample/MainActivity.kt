package ru.rma.apps.nontransitive.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.rma.apps.nontransitive.sample.module1.SomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, SomeFragment())
                .commit()
        }
    }
}