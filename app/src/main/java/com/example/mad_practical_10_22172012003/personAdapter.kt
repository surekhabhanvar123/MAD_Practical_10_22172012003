package com.example.mad_practical_10_22172012003

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.util.ArrayList

class personAdapter(context:Context,val array:ArrayList<Person>):ArrayAdapter<Person>(context,0,array)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        return view
    }
    val person data=array.get(position)
            view findViewbyid<textview>(R.id.name).text=person data.email
}