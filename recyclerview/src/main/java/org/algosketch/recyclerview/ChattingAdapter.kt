package org.algosketch.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChattingAdapter(private val messages: ArrayList<Message>) : RecyclerView.Adapter<ChattingAdapter.ViewHolder>() {
    // 이 아답터는 item_recyclerview 와 연결되어 있음 알려준다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recyclerview, parent, false)

        return ViewHolder(view)
    }
    // holder 를 통해 view 를 수정
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.message?.text = messages[position].msg
        Log.i("123123", position.toString())
    }
    // 아이템의 개수
    override fun getItemCount(): Int = messages.size
    /* 아래 코드와 동일
    override fun getItemCount(): Int {
        return messages.size
    }
    */

    // item_recyclerview 의 View 를 가져오는 역할
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var message: TextView? = null
        init {
            message = view.findViewById(R.id.tv_message)
        }
    }

    // 리사이클러뷰 각각에 담을 내용을 갖는 데이터 클래스
    data class Message(val msg: String)
}