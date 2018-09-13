package nz.co.oxenburgh.fibonaccicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var prev = 0
    var current = 1

    fun nextInSequence(view: View) {
        val next = prev + current
        if(next < 0){
            textView.text = getString(R.string.overflow_error)
        }else{
            textView.text = "%d = %d + %d".format(next, current, prev)
            prev = current
            current = next
        }
    }

}
