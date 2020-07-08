package ibrahim.aytimur.kotlinclasssiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Kotlin Class - Sınıflar
        // Bilgisayar
       /* var ozellikler = Bilgisayar()
        textView.text = ozellikler.marka+"\n"+ozellikler.islemci+"\n"+
                ozellikler.ram+"\n"+ozellikler.ekrankarti+"\n"*/

        // Bilgisayar2
        /*var ozellikler = Bilgisayar2()
        ozellikler.marka = "Asus"
        ozellikler.islemci= "intel i9 9900k"
        ozellikler.ram = "32Gb"
        ozellikler.ekrankarti = "Quadro rtx 6000"
        textView.text = ozellikler.marka+"\n"+ozellikler.islemci+"\n"+
                ozellikler.ram+"\n"+ozellikler.ekrankarti+"\n"*/

        // Bilgisayar3
        /*var ozellikler = Bilgisayar3("Lenovo","intel i9 9900k","32Gb",
            "Quadro rtx 6000")
        textView.text = ozellikler.marka+"\n"+ozellikler.islemci+"\n"+
                ozellikler.ram+"\n"+ozellikler.ekrankarti+"\n"*/

        // Bilgisayar4
       /* var ozellikler = Bilgisayar4("MSI","intel i9 9900k","32GB",
        "Quadro rtx 600")
        textView.text = ozellikler.marka+"\n"+ozellikler.islemci+"\n"+
                ozellikler.ram+"\n"+ozellikler.ekrankarti+"\n"*/

        // Bilgisayar5
       /* var ozellikler = Bilgisayar5()
        textView.text = ozellikler.goster()*/

        // Bilgisayar6 
        var ozellikler = Bilgisayar6()
        ozellikler.ram = "32Gb"



    }
}