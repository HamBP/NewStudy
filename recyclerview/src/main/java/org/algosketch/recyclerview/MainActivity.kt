package org.algosketch.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chattingList = arrayListOf(
            ChattingAdapter.Message("안녕하세요?\n앱센터입니다."),
            ChattingAdapter.Message("3주차는 리사이클러뷰에 대해 배웁니다."),
            ChattingAdapter.Message("할 말이 없어서 이렇게 적어 봅니다.\nㅎㅎㅎ")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ChattingAdapter(chattingList)
    }
}