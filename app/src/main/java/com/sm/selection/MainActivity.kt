package com.sm.selection

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.sm.selection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//بعرف الزرار الاول الي هحطلة الاكشن الي هيعمله

        binding.doneButton.setOnClickListener {
            choose()
        }

    }

    private fun choose() {

        val op1 = binding.input1.text.toString()
        val op2 = binding.input2.text.toString()
        val op3 = binding.input3.text.toString()
        val op4 = binding.input4.text.toString()
        //val op4 = arrayOf(binding.input4).toString()
        //val op4 = listOf(binding.input4).toString()


        val intent = Intent(this, YourSelection::class.java)
        intent.putExtra("your option1", op1)
        intent.putExtra("your option2", op2)
        intent.putExtra("your option3", op3)
        intent.putExtra("your option4", op4)
        startActivity(intent)

    }
}
