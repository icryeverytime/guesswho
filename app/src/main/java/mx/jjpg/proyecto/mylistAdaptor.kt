package mx.jjpg.proyecto

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.widget.CursorAdapter
import android.widget.TextView

class mylistAdaptor(private val mList:List<ItemsViewModel>):RecyclerView.Adapter<mylistAdaptor.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int):RecyclerView.ViewHolder{
        val view=LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel=mList[position]

        holder.textView.text=ItemsViewModel.text
    }
    override fun getItemCount():Int{
        return mList.size
    }
    class ViewHolder(ItemView: View):ViewHolder(ItemView){
        val textView: TextView=ItemView.findViewById(R.id.textview1)
    }

}