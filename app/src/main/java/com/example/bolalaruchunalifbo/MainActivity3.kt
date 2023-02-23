package com.example.bolalaruchunalifbo

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bolalaruchunalifbo.databinding.ActivityMain3Binding
import com.example.bolalaruchunalifbo.model.Question

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    var a = 0
    var trueanswer=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var gamelist = arrayOf<Question>(
            Question(R.raw.anitop, "A", "S", "I"),
            Question(R.raw.bnitop, "B", "Ng", "S"),
            Question(R.raw.dnitop, "D", "Ch", "O"),
            Question(R.raw.enitop, "E", "Sh", "I"),
            Question(R.raw.fnitop, "F", "G'", "T"),
            Question(R.raw.gnitop, "G", "O'", "B"),
            Question(R.raw.hnitop, "H", "Z", "K"),
            Question(R.raw.jnitop, "J", "X", "P"),
            Question(R.raw.knitop, "K", "V", "M"),
            Question(R.raw.lnitop, "L", "U", "Ng"),
            Question(R.raw.mnitop, "M", "T", "Ch"),
            Question(R.raw.nnitop, "N", "S", "K"),
            Question(R.raw.onitop, "O", "R", "S"),
            Question(R.raw.pnitop, "P", "Q", "O"),
            Question(R.raw.qnitop, "Q", "Y", "M"),
            Question(R.raw.rnitop, "R", "O", "E"),
            Question(R.raw.snitop, "S", "N", "R"),
            Question(R.raw.tnitop, "T", "M", "V"),
            Question(R.raw.unitop, "U", "L", "A"),
            Question(R.raw.vnitop, "V", "K", "P"),
            Question(R.raw.xnitop, "X", "J", "K"),
            Question(R.raw.ynitop, "Y", "H", "Z"),
            Question(R.raw.znitop, "Z", "G", "Ch"),
            Question(R.raw.shnitop, "Sh", "D", "K"),
            Question(R.raw.chnitop, "Ch", "B", "F"),
        )
        gamelist.shuffle()


        binding.btnstart.setOnClickListener {
            binding.linearquestion.visibility = View.VISIBLE
            binding.linearanswer.visibility = View.VISIBLE
            binding.btnnext.visibility= View.VISIBLE
            binding.btnstart.visibility= View.GONE
            val answers= arrayOf(
                gamelist.get(a).answer1,
                gamelist.get(a).anwwer2,
                gamelist.get(a).anwwer3
            )
            trueanswer=answers.get(0)
            answers.shuffle()

            binding.apply {
                textans1.text = answers.get(0)
                textans2.text = answers.get(1)
                textans3.text = answers.get(2)
            }
            val mediaPlayer = MediaPlayer.create(this@MainActivity3,gamelist.get(a).question)
            mediaPlayer.start()
        }
        binding.imagequestion.setOnClickListener {
            binding.apply {
                if (a==0) {
                    val mediaPlayer = MediaPlayer.create(this@MainActivity3, gamelist.get(a).question)
                    mediaPlayer.start()
                }else if (a>0) {
                    val mediaPlayer = MediaPlayer.create(this@MainActivity3, gamelist.get(a-1).question)
                    mediaPlayer.start()
                }
            }
        }
        binding.btnnext.apply {
            setOnClickListener {
                binding.textans1.background=getDrawable(R.drawable.nullansver)
                binding.textans2.background=getDrawable(R.drawable.nullansver)
                binding.textans3.background=getDrawable(R.drawable.nullansver)
                val answers= arrayOf(
                    gamelist.get(a).answer1,
                    gamelist.get(a).anwwer2,
                    gamelist.get(a).anwwer3
                )
                trueanswer=answers.get(0)
                answers.shuffle()

                binding.apply {
                    textans1.text = answers.get(0)
                    textans2.text = answers.get(1)
                    textans3.text = answers.get(2)
                }

                val mediaPlayer = MediaPlayer.create(this@MainActivity3,gamelist.get(a).question)
                mediaPlayer.start()
                a++
                if(a==gamelist.size){
                    Toast.makeText(this@MainActivity3, "oxiri", Toast.LENGTH_SHORT).show()
                   a=1
                }
            }
        }
        binding.textans1.setOnClickListener {
            if (trueanswer==binding.textans1.text){
                binding.textans1.background=getDrawable(R.drawable.trueanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.correctanswer)
                mediaPlayer.start()
            }else{
                binding.textans1.background=getDrawable(R.drawable.falseanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.wronganser)
                mediaPlayer.start()
            }
        }
        binding.textans2.setOnClickListener {
            if (trueanswer==binding.textans2.text){
                binding.textans2.background=getDrawable(R.drawable.trueanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.correctanswer)
                mediaPlayer.start()
            }else{
                binding.textans2.background=getDrawable(R.drawable.falseanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.wronganser)
                mediaPlayer.start()
            }
        }
        binding.textans3.setOnClickListener {
            if (trueanswer==binding.textans3.text){
                binding.textans3.background=getDrawable(R.drawable.trueanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.correctanswer)
                mediaPlayer.start()
            }else{
                binding.textans3.background=getDrawable(R.drawable.falseanswer)
                val mediaPlayer= MediaPlayer.create(this@MainActivity3,R.raw.wronganser)
                mediaPlayer.start()
            }
        }
    }
}