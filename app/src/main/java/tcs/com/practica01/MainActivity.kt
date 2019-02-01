package tcs.com.practica01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //4.- Crear un producto y asignarle a su propiedad 3 points name “CocaCola”  id: 10987  price: Money(value:2.0,TypeCurrency.Soles)

        var oMoney:Money = Money(2.0, typeCurrency.SOLES)
        oMoney.value = 20.0
        var oSymbol = oMoney.GetSymbol()
        var oProduct:Product = Product(10987, "CocaCola",oMoney)
        var newValue =oProduct.price.value.toString()
        var nameProduct = oProduct.name

        //5.- Mostrar en Log o en un TextView  5 points el costo de CocaCola es de: S/ 20
        this.textView.text = "El costo de $nameProduct es de: $oSymbol $newValue"

        Toast.makeText(this,"El costo de $nameProduct es de: $oSymbol $newValue",Toast.LENGTH_LONG).show()
    }
}
