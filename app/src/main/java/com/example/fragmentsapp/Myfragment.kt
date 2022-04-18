package com.example.fragmentsapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class Myfragment:DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        var rootView: View= inflater.inflate(R.layout.dialog_fragment, container, false)
        var cancelButton=rootView.findViewById<Button>(R.id.cancelButton)
        var submitButton=rootView.findViewById<Button>(R.id.submitButton)
        var surveyRadioGroup=rootView.findViewById<RadioGroup>(R.id.ratingRadioGroup)

        cancelButton.setOnClickListener(object :View.OnClickListener
        {
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
                dismiss()
            }
        })


        submitButton.setOnClickListener(object :View.OnClickListener
        {
            override fun onClick(p0: View?) {

                val selectedId=surveyRadioGroup.checkedRadioButtonId
                val selecteRadioButton=rootView.findViewById<Button>(selectedId)

                var ratingResult = selecteRadioButton.text.toString()

                //Log.d("test",selecteRadioButton.text.toString())

                Toast.makeText(activity,"You Picked: $ratingResult ", Toast.LENGTH_LONG).show()
                dismiss()
            }
        })
        return rootView


    }



}








