package tcs.com.practica01

////2.- Crear la clase Money y define sus propiedades value, symbol, typeCurrency y tambien su metodo fun GetSymbol():String que se encargara de devolver S/ o $.  TypeCurrency define el tipo soles y dólares en nuestro sistema

enum class typeCurrency{
SOLES, DOLARES
}

class Money(value:Double,symbol:typeCurrency) {
    var value:Double = value
    var symbol:typeCurrency = symbol

    fun  GetSymbol(): String{
        if (this.symbol.name == "SOLES"){
            return "S/."
        }
        return "$"
    }
}

