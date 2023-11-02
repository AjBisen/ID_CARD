package com.example.damiresgestration
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // define objects for edit text and button
    private lateinit var edittext: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting instance of edittext and button
        button = findViewById(R.id.button)
        edittext = findViewById(R.id.editText)

        // Attach set on click listener to the button for initiating intent
        button.setOnClickListener(View.OnClickListener {
            // getting phone number from edit text and changing it to String
            val phone_number = edittext.text.toString()

            // Getting instance of Intent with action as ACTION_CALL
            val phone_intent = Intent(Intent.ACTION_CALL)

            // Set data of Intent through Uri by parsing phone number
            phone_intent.data = Uri.parse("tel:$phone_number")

            // start Intent
            startActivity(phone_intent)
        })
    }
}