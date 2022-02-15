package com.example.testwall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testwall.test.TestByteBuffer
import com.meituan.android.walle.WalleChannelReader
import java.nio.ByteBuffer

class MainActivity : AppCompatActivity() {
    private var mChannelTv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mChannelTv = findViewById<TextView>(R.id.channel_tv)
        mChannelTv?.text = WalleChannelReader.getChannel(this, "test111")
        TestByteBuffer.testByteBuffer()
    }


}