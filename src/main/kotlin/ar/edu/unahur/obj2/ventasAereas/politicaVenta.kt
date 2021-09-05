package ar.edu.unahur.obj2.ventasAereas

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////
/////////////////////////POLITICAS DE VENTA ////////////////////////////////
////////////////////////////////////////////////////////////////////////////

abstract class PoliticaDeVenta(){
    abstract fun sePuedeVender(vuelito: Vuelo): Boolean
}

class Segura(): PoliticaDeVenta(){
    override fun sePuedeVender(vuelito: Vuelo): Boolean{
        return vuelito.asientosLibres() > 3
    }}

class LaxaFija(): PoliticaDeVenta() {
    override fun sePuedeVender(vuelito: Vuelo): Boolean {
        return vuelito.pasajesVendidos.size < vuelito.asientosDisponibles() + 10
    }
}

class LaxaPorcentual(): PoliticaDeVenta() {
    override fun sePuedeVender(vuelito: Vuelo): Boolean {
        return vuelito.pasajesVendidos.size < vuelito.asientosDisponibles() + (vuelito.asientosDisponibles()*10)/100
    }
}

class Pandemia(): PoliticaDeVenta(){
    override fun sePuedeVender(vuelito: Vuelo): Boolean{ return false }
}