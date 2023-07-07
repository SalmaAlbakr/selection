package com.sm.selection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sm.selection.databinding.ActivitySelectionBinding


class YourSelection : AppCompatActivity() {

    private lateinit var binding: ActivitySelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_selection)

        binding = ActivitySelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val option1 = intent.extras?.getString("your option1", "your option")
        val opt1 = findViewById<TextView>(R.id.theOption1)
        opt1.text = option1.toString()

        val option2 = intent.extras?.getString("your option2", "your option")
        val opt2 = findViewById<TextView>(R.id.theOption2)
        opt2.text = option2.toString()

        val option3 = intent.extras?.getString("your option3", "your option")
        val opt3 = findViewById<TextView>(R.id.theOption3)
        opt3.text = option3.toString()

        val option4 = intent.extras?.getString("your option4", "your option")
        val opt4 = findViewById<TextView>(R.id.theOption4)
        opt4.text = option4.toString()

        /*val option4: Array<String>? = intent.extras?.getStringArray("your option4")
        val opt4 = findViewById<TextView>(R.id.theOption4)
        opt4.text = arrayOf(option4).toString()*/

        val rOption: List<String?> = listOf(option1, option2, option3, option4).toList()
        val f1 = rOption.random()

        //بعرف الزرار الاول الي هحطلة الاكشن الي هيعمله
        // val startButton = findViewById<Button>(R.id.startButton)
        // val backButton = findViewById<Button>(R.id.BackButton)
// بحط اسم الزرار عشان اضيف عليه اكشن يعمله لما اضغط عليه

        binding.BackButton.setOnClickListener {
            val n = Intent(this, MainActivity::class.java)
            startActivity(n)
        }

        binding.startButton.setOnClickListener {
            val intent = Intent(this, FinalScreen::class.java)
            intent.putExtra("option", f1)
            startActivity(intent)

        }

    }


}


