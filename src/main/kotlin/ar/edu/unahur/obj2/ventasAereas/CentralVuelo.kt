package ar.edu.unahur.obj2.ventasAereas

import java.time.LocalDate

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////
//////////////////////////CLASE CENTRAL DE VUELOS//////////////////////////
///////////////////////////////////////////////////////////////////////////

class CentralVuelos(){
    var listaVuelos = mutableListOf<Vuelo>()

    fun agregarVuelo(vueloNuevo: Vuelo){
        listaVuelos.add(vueloNuevo)
    }

    fun cuandoVuelo(dni: Int, destino: String): LocalDate {
        var fecha = LocalDate.of(1, 1 ,1)

        var vuelosConDestinoA = listaVuelos.filter{v -> v.lugarDestino == destino}

        for(i in vuelosConDestinoA){
            if(i.seEncuentraLaPersona(dni)){ fecha = i.fecha }

        }

        return fecha
    }

    fun asientosLibresEntre(destino: String, fechaUno: LocalDate, fechaDos: LocalDate): Int {
        var vuelosConDestino = listaVuelos.filter { it.lugarDestino == destino }

        var listaAuxiliar = mutableListOf<Vuelo>()

        for (i in vuelosConDestino) {
            if (i.fecha.isAfter(fechaUno) && i.fecha.isBefore(fechaDos)) {
                listaAuxiliar.add(i)
            }
        }

        return listaAuxiliar.sumBy { p -> p.asientosLibres() }

    }

    fun sonCompanieros(dniUno: Int, dniDos: Int): Boolean{
        var vuelosCompartidos = 0
        var companieros = false

        for(i in listaVuelos){
            if(i.seEncuentraLaPersona(dniUno) && i.seEncuentraLaPersona(dniDos)){ vuelosCompartidos = vuelosCompartidos + 1 }
        }

        if(vuelosCompartidos > 3){ companieros = true}

        return companieros
    }
}