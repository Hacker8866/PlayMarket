package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarket.adapters.PlayMarketAdapter
import com.example.playmarket.models.GeneralData
import com.example.playmarket.models.Program
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var generalList: ArrayList<GeneralData>
    lateinit var playMarketAdapter: PlayMarketAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        loadData()
        playMarketAdapter = PlayMarketAdapter(generalList)
        rv.adapter = playMarketAdapter
    }

    private fun loadData() {
        generalList = ArrayList()
        val program1 = Program("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVHacmE-M_pHIn55NM5y9ebPCCzK7GxepWjqAhZO_ZiqU0uVA-MO0TbStx2-aXXlhXABg&usqp=CAU","WhatsApp Messenger")
        val program2 = Program("https://d.newsweek.com/en/full/1506755/how-half-open-snap-snapchat-notification-does-snapchat-notify-you-when-snap-half-opened.jpg?w=1600&h=1600&q=88&f=1eb97d6266b9dd9fbef43840dae8e988","Snapchat")
        val program3 = Program("https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/yvbOx5two0W.png","Messenger")
        val program4 = Program("https://play-lh.googleusercontent.com/0IdG4GLN7T73OrfRWwb3M1dyuFPmuAftPepnHS6p8qoTGvXXeHKHQY54-B8OXEbAZGI","imo-International Calls & Chat")

        val program5 = Program("https://techniorg.com/wp-content/uploads/2021/04/imo-HD-Free-Video-Calls-and-Chats.jpg","imo HD - Video Calls and Chat")
        val program6 = Program("https://play-lh.googleusercontent.com/7ksI3wqLkssOYZWyB9ao6gTMw3RlafJDG4mtjVVk8bhqZhDKrTvhdxPRm69yVVJZciY","Vidogram")
        val program7 = Program("https://www.prnewsonline.com/wp-content/uploads/2019/04/wechat-logo.jpg","WeChat")
        val program8 = Program("https://apksshare.com/wp-content/uploads/2021/06/Skype-free-IM-video-calls-APK-MOD-Download-8.72.0.94.png","Skype")

        val program9 = Program("https://play-lh.googleusercontent.com/IBI3NBJnotGmLpro8gWpFUyC_oc8LLC5nTD6QAWZ7WsCXxUwI0RuGnFkZgMqXzETNg","UC Browser Turbo - Fast")
        val program10 = Program("https://play-lh.googleusercontent.com/IVnAHnHZmtKXjgMfHUF35-0U6pKo8-cyp-O4lUtKYGv1smK3yucfatJ2slXD2Hp-Dmc4","UC Mini - Download")
        val program11 = Program("https://play-lh.googleusercontent.com/kYv7AERFN3BIeIRYZnqnud7eU_11p7Ly46y99-EcoOHGxfWEbQWpAgyscMGUhPw4opNe","Phoenix Browser - Fast")
        val program12 = Program("https://play-lh.googleusercontent.com/I1foi2Irrv7tW9ee9kgP0wfnMzaVb6y17muvpKsFcUrKYsDlmCyWuTRh5m93KJZ24dY","Brave Private Web Browser")

        val program13 = Program("https://play-lh.googleusercontent.com/A6Eecj1lNnjdE6UH4CfFFe6ThML-VS2bsuUUfFhCgUfCsF0m1ZgWAv0_XQ8Yn9d4WX4=s370-rw","USSD Codes")
        val program14 = Program("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdzvhIs1PYhQ75W80A9Z5u6_ayhdZKRuwx8iuqt0iRAEDOj7ITPveRiMQpgO0uVDbi8y8&usqp=CAU","Mail.ru - Email App")
        val program15 = Program("https://expandedramblings.com/wp-content/uploads/2017/08/discord-statistics.jpg","Discord - Chat, Talk & Hangout")
        val program16 = Program("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDrsR9JwuXu2SxxUVIslnGey6TfMgQjyD0rhU0ssFBtW1s_TUTIzKJJ0GkGhveAn7rC78&usqp=CAU","Viber - Safe Chats And Calls")

        generalList.add(GeneralData("Communication", listOf(program1,program2,program3,program4)))
        generalList.add(GeneralData("Video chatting", listOf(program5,program6,program7,program8)))
        generalList.add(GeneralData("Tools & utilities", listOf(program9,program10,program11,program12)))
        generalList.add(GeneralData("Recommended for you", listOf(program13,program14,program15,program16)))
    }
}