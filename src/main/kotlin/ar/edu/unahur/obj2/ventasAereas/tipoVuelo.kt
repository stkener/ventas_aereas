package ar.edu.unahur.obj2.ventasAereas

import java.time.LocalDate

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////
////////////////////////TIPOS DE VUELOS/////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
class VueloPasajeros(fecha: LocalDate, unAvion: Avion, lugarOrigen: String, lugarDestino: String, tiempoVuelo: Int, monto: Int, ventaAsientos: VentaAsientos, polVenta: PoliticaDeVenta):
    Vuelo(fecha, unAvion, lugarOrigen, lugarDestino, tiempoVuelo, monto, ventaAsientos, polVenta){
    var valija = 10

    override fun asientosDisponibles(): Int {
        return unAvion.asientos
    }

    override fun pesoMaximo(): Int {
        val pesoAvion = unAvion.peso
        val pesoPasajeros = this.asientosOcupados()*90
        val pesoCarga = this.asientosOcupados() * valija

        return pesoAvion + pesoPasajeros + pesoCarga
    }
}

class VueloCarga(fecha: LocalDate, unAvion: Avion, lugarOrigen: String, lugarDestino: String, tiempoVuelo: Int, monto: Int, ventaAsientos: VentaAsientos, polVenta: PoliticaDeVenta):
    Vuelo(fecha, unAvion, lugarOrigen, lugarDestino, tiempoVuelo, monto, ventaAsientos, polVenta){
    var pesoBultos = 0

    override fun asientosDisponibles() = 10

    override fun pesoMaximo(): Int {
        val pesoAvion = unAvion.peso
        val pesoPasajeros = this.asientosOcupados()*90
        val pesoCarga = pesoBultos + 700

        return pesoAvion + pesoPasajeros + pesoCarga
    }
}

class VueloCharter(fecha: LocalDate, unAvion: Avion, lugarOrigen: String, lugarDestino: String, tiempoVuelo: Int, monto: Int, ventaAsientos: VentaAsientos, polVenta: PoliticaDeVenta):
    Vuelo(fecha, unAvion, lugarOrigen, lugarDestino, tiempoVuelo, monto, ventaAsientos, polVenta){

    override fun asientosDisponibles() = unAvion.asientos - 25

    override fun pesoMaximo(): Int {
        val pesoAvion = unAvion.peso
        val pesoPasajeros = this.asientosOcupados()*90
        val pesoCarga = 5000

        return pesoAvion + pesoPasajeros + pesoCarga
    }

    /*PESO ESTANDAR DEFINIDO POR LA IATA = 90*/
}