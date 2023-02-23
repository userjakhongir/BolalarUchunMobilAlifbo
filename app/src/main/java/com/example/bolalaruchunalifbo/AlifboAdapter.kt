package com.example.bolalaruchunalifbo

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bolalaruchunalifbo.databinding.RecryclerviewiItemBinding

class AlifboAdapter constructor(
    val context: Context,
    val arrayletter: Array<String>,
    val arrayword: Array<String>,
    val arrayimages: Array<Int>,
    val arrraymusic:Array<Int>
): RecyclerView.Adapter<AlifboAdapter.AlifboViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlifboViewHolder {
        val view= RecryclerviewiItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return AlifboViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  arrayletter.size
    }

    override fun onBindViewHolder(holder: AlifboViewHolder, position: Int) {

        holder.binding.apply {
            imagesviewitem.setImageResource(arrayimages.get(position))
            textitem.text=arrayword.get(position)
            textviewitem.text=arrayletter.get(position)


            recyclerviewitem.setOnClickListener {
                  val mediaPlayer= MediaPlayer.create(context,arrraymusic.get(position))
                 mediaPlayer.start()

//                val intent = Intent(context,MainActivity4::class.java)
//                intent.putExtra("position", position)
//                intent.putExtra("letter", arrayletter.get(position))
//                context.startActivity(intent)
            }
        }

    }
    class AlifboViewHolder(val binding: RecryclerviewiItemBinding): RecyclerView.ViewHolder(binding.root)
}