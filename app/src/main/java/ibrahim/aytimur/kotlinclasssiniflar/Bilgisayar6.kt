package ibrahim.aytimur.kotlinclasssiniflar

class Bilgisayar6 {
    // Özellikler
    private var marka = "Dell"
    public var islemci = "intel i9 9900k"
    var ram = "32GB"
    var ekrankarti = "Quadro rtx 600"
    fun goster():String{
        return marka+"\n"+islemci+"\n"+ram+"\n"+ekrankarti+"\n"
    }
}