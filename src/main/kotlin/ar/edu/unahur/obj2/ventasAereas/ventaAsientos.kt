package ar.edu.unahur.obj2.ventasAereas

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////
/////////////////////////TIPOS DE VENTA ASIENTOS////////////////////////////
////////////////////////////////////////////////////////////////////////////

abstract class VentaAsientos(){
    abstract fun montoFinal(volando: Vuelo): Int
}

class Estricta(): VentaAsientos(){
    override fun montoFinal(volando: Vuelo) = volando.monto
}

class VentaAnticipada(): VentaAsientos(){
    override fun montoFinal(volando: Vuelo): Int{
        var aPagar = volando.monto
        if(volando.asientosOcupados() < 40){ aPagar = (volando.monto*30)/100 }
        if(volando.asientosOcupados() >= 40 && volando.asientosOcupados() < 80){ aPagar = (volando.monto*60)/100 }
        return aPagar
    }
}

class Remate(): VentaAsientos(){
    override fun montoFinal(volando: Vuelo): Int{
        var aPagar = (volando.monto*50)/100
        if(volando.asientosLibres() > 30){ aPagar = (volando.monto*25)/100 }
        return aPagar
    }
}
