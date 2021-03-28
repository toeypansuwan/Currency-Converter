package th.ac.su.ict.curencyconverter

import com.google.gson.annotations.SerializedName

   
data class Rates (

   @SerializedName("CAD") var CAD : Double,
   @SerializedName("HKD") var HKD : Double,
   @SerializedName("ISK") var ISK : Double,
   @SerializedName("PHP") var PHP : Double,
   @SerializedName("DKK") var DKK : Double,
   @SerializedName("HUF") var HUF : Double,
   @SerializedName("CZK") var CZK : Double,
   @SerializedName("GBP") var GBP : Double,
   @SerializedName("RON") var RON : Double,
   @SerializedName("SEK") var SEK : Double,
   @SerializedName("IDR") var IDR : Double,
   @SerializedName("INR") var INR : Double,
   @SerializedName("BRL") var BRL : Double,
   @SerializedName("RUB") var RUB : Double,
   @SerializedName("HRK") var HRK : Double,
   @SerializedName("JPY") var JPY : Double,
   @SerializedName("THB") var THB : Double,
   @SerializedName("CHF") var CHF : Double,
   @SerializedName("EUR") var EUR : Double,
   @SerializedName("MYR") var MYR : Double,
   @SerializedName("BGN") var BGN : Double,
   @SerializedName("TRY") var TRY : Double,
   @SerializedName("CNY") var CNY : Double,
   @SerializedName("NOK") var NOK : Double,
   @SerializedName("NZD") var NZD : Double,
   @SerializedName("ZAR") var ZAR : Double,
   @SerializedName("USD") var USD : Int,
   @SerializedName("MXN") var MXN : Double,
   @SerializedName("SGD") var SGD : Double,
   @SerializedName("AUD") var AUD : Double,
   @SerializedName("ILS") var ILS : Double,
   @SerializedName("KRW") var KRW : Double,
   @SerializedName("PLN") var PLN : Double

)