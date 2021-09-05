package ar.edu.unahur.obj2.ventasAereas

import java.time.LocalDate
import java.util.*
import ar.edu.unahur.obj2.ventasAereas.VentaAsientos as VentaAsientos

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////
/////////////////////////////CLASE AVION////////////////////////////////////
////////////////////////////////////////////////////////////////////////////

abstract class Avion(var asientos: Int, val alturaCabina: Int, val peso: Int)

class Airbus(): Avion(320, 2, 100000)//altura en metros
class Boeing(): Avion(460, 4, 150000)
class Privado(): Avion(50, 5, 70000)

////////////////////////////////////////////////////////////////////////////
/////////////////////////////CLASE VUELO////////////////////////////////////
////////////////////////////////////////////////////////////////////////////

abstract class Vuelo(var fecha: LocalDate, var unAvion: Avion, var lugarOrigen: String, var lugarDestino: String, var tiempoVuelo: Int, val monto: Int, var ventaAsientos: VentaAsientos, var polVenta: PoliticaDeVenta){
    var pasajesVendidos = mutableListOf<Pasajes>()

    /*CAMBIAR PARAMETROS*/

    fun cambiarAvion(otroAvion: Avion){ unAvion = otroAvion }
    fun cambiarVentaAsientos(unTipo: VentaAsientos){ ventaAsientos = unTipo }
    fun cambiarPoliticaVenta(unTipo: PoliticaDeVenta){ polVenta = unTipo }

    ///////////////////////////////////////////////////////////////////////////////////

    abstract fun asientosDisponibles(): Int

    fun venderPasajes(fechaVenta: LocalDate, dni: Int ){

       var nuevoPasaje = Pasajes(this, fechaVenta, dni )

       if(this.sePuedeVender()){ pasajesVendidos.add(nuevoPasaje)}
       else{ error("No se puede vender pasajes para este vuelo") }
    }

    /*OTRA VERSION DE VENDER PASAJES(El pasaje armado fuera del vuelo)

    fun venderPasajes(unPasaje: Pasajes ){

       if(this.sePuedeVender()){ cantPasajes.add(nuevoPasaje)}
       else{ error("No se puede vender pasajes para este vuelo") }
    }*/

    fun asientosOcupados(): Int{ return pasajesVendidos.size}

    fun asientosLibres(): Int{ return this.asientosDisponibles() - this.asientosOcupados() }

    fun esRelajado(): Boolean{ return this.asientosDisponibles() < 100 && unAvion.alturaCabina > 4 }

    abstract fun pesoMaximo(): Int

    fun sePuedeVender(): Boolean{ return polVenta.sePuedeVender(this) }

    fun precioPasaje(): Int{ return ventaAsientos.montoFinal(this) }

    fun montoTotalVuelo(): Int{ return pasajesVendidos.sumBy { p -> p.monto } }

    fun seEncuentraLaPersona(dni: Int): Boolean{
        var vuelaONo = false

        for(i in pasajesVendidos){
            if(i.dniPasajero == dni){ vuelaONo = true }
            }
        return vuelaONo
    }
}

///////////////////////////////////////////////////////////////////////////
////////////////////////////////CLASE PASAJES//////////////////////////////
////////////////////////////////////////////////////////////////////////////

class Pasajes(var vuelo: Vuelo, var fechaPasaje: LocalDate, var dniPasajero: Int){
    val monto = vuelo.precioPasaje()
}


