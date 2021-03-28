package th.ac.su.ict.curencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var edtUsa:EditText
    lateinit var tvThb:TextView
    lateinit var btnConverter:Button
    lateinit var tvUsd:TextView

    var BASE_URL = "https://api.exchangeratesapi.io/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsa = findViewById<EditText>(R.id.edtUsa)
        tvThb = findViewById<TextView>(R.id.tvThb)
        tvUsd = findViewById<TextView>(R.id.tvUsd)
        val btnConverter = findViewById<Button>(R.id.btnConverter)

        btnConverter.setOnClickListener {
            getCurrentMoneyData()
        }

    } //override
    fun getCurrentMoneyData() {

        val retrofit =Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(MoneyService::class.java)
        val call = service.getCurrentMoneyData("USD")

        call.enqueue(object : Callback<MoneyResponse>{



            override fun onFailure(call: Call<MoneyResponse>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
            override fun onResponse(
                call: Call<MoneyResponse>?,
                response: Response<MoneyResponse>?

            ) {

                if (response!=null){
                    if (response.code() == 200){

                        val moneyRes = response.body()
                        val cal = moneyRes.rates.THB.toDouble()
                        val enit:Double = edtUsa.text.toString().toDouble()
                        val sum = (enit*cal)
                        tvThb.text = "THB = ${sum.toString()}"

                        val showTHB = moneyRes.rates.THB.toString()
                        tvUsd.text = "1 USD = ${showTHB.toString()}"

                    }
                }
            }
        })
    }
}