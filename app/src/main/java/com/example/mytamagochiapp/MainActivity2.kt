package com.example.mytamagochiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var Hunger = 100
    private var Happy = 50
    private var clean = 50
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        var hunger = 10
        var  happy = 30
        var clean = 50

        // set the buttons and text views
        val button4  = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val txtHunger =findViewById<EditText>(R.id.editTextText)
        val txtHappy = findViewById<EditText>(R.id.editTextText2)
        val txtClean = findViewById<EditText>(R.id.editTextText3)
        val petImage = findViewById<ImageView>(R.id.petImage)

         val feedbutton = findViewById<Button>(R.id.button4)
         val cleanButton = findViewById<Button>(R.id.button5)
         val playButton = findViewById<Button>(R.id.button6)







        // Set the initial text values

        txtHunger.setText(hunger.toString())
        txtHappy.setText(happy.toString())
        txtClean.setText(clean.toString())


         fun animateImageChange(petImage: ImageView?, action: String) {
            val resourceId = when (action) {
                "feed" -> R.drawable.hungry
                "play" -> R.drawable.happy
                "clean" -> R.drawable.clean
                else -> return // Do nothing if action is not recognized
            }
            petImage?.setImageResource(resourceId)
        }



        // handle button clicks
        button4.setOnClickListener {

            hunger += 4
            happy += 2
            clean -= 7
            txtHunger.setText(hunger.toString())
            animateImageChange(petImage,R.drawable.hungry)


        }

        button6.setOnClickListener {

            happy += 3
            hunger -= 2
            clean -= 5
            txtClean.setText(clean.toString())
            animateImageChange(petImage,R.drawable.clean)

        }

         button5.setOnClickListener {

             hunger += 2
             happy += 2
             clean += 8
             txtHappy.setText(clean.toString())
             animateImageChange(petImage,R.drawable.happy)



         }




            }

    private fun animateImageChange(petImage: ImageView?, happy: Int) {

    }


}





