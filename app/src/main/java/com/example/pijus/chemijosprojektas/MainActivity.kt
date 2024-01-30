package com.example.pijus.chemijosprojektas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.PossibleAmount.*
import com.example.pijus.chemijosprojektas.Quantity.*

open class MainActivity : AppCompatActivity() {
    private val toastMessage = "prasome pasirinkti nors viena recepta"
    private val pages1: ArrayList<Class<*>?> = object : ArrayList<Class<*>?>() {
        init {
            add(vonioszele1::class.java)
            add(kauke1::class.java)
            add(unknown1::class.java)
            add(balzamas1::class.java)
            add(losjonas1::class.java)
            add(dezodorantas1::class.java)
            add(pasta1::class.java)
            add(balinamoji1::class.java)
            add(avizos1::class.java)
        }
    }
    var pages2: ArrayList<Class<*>?> = object : ArrayList<Class<*>?>() {
        init {
            add(vonioszele2::class.java)
            add(kauke2::class.java)
            add(unknown2::class.java)
            add(balzamas2::class.java)
            add(losjonas2::class.java)
            add(dezodorantas2::class.java)
            add(pasta2::class.java)
            add(balinamoji2::class.java)
            add(avizos2::class.java)
        }
    }

    //    ArrayList<RadioButton>
    var radioButtons: ArrayList<RadioButton> = ArrayList<RadioButton>()

    var radioGroup: RadioGroup? = null

    var kelintaspage = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.radioGroup)
        radioButtons.add(findViewById(R.id.RadioButton))
        radioButtons.add(findViewById(R.id.RadioButton2))
        radioButtons.add(findViewById(R.id.RadioButton3))
        radioButtons.add(findViewById(R.id.RadioButton4))
        radioButtons.add(findViewById(R.id.RadioButton5))
        radioButtons.add(findViewById(R.id.RadioButton6))
        radioButtons.add(findViewById(R.id.RadioButton7))
        radioButtons.add(findViewById(R.id.RadioButton8))
        radioButtons.add(findViewById(R.id.RadioButton9))
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { openScreen(pages1) }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener { openScreen(pages2) }
    }

    private fun openScreen(pagesList: ArrayList<Class<*>?>) {
        if (kelintaspage == 0) {
            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
        } else {
            startActivity(Intent(applicationContext, pagesList[kelintaspage + 1]))
        }
    }

    private fun setRadioButton(radioButtonId: Int) {
        for (i in radioButtons.indices) {
            radioButtons[i].isChecked = radioButtonId == i
        }
        kelintaspage = radioButtonId
    }

    fun funkcija(v: View?) {
        setRadioButton(1)
    }

    fun funkcija2(v: View?) {
        setRadioButton(2)
    }

    fun funkcija3(v: View?) {
        setRadioButton(3)
    }

    fun funkcija4(v: View?) {
        setRadioButton(4)
    }

    fun funkcija5(v: View?) {
        setRadioButton(5)
    }

    fun funkcija6(v: View?) {
        setRadioButton(6)
    }

    fun funkcija7(v: View?) {
        setRadioButton(7)
    }

    fun funkcija8(v: View?) {
        setRadioButton(8)
    }

    fun funkcija9(v: View?) {
        setRadioButton(9)
    }
}