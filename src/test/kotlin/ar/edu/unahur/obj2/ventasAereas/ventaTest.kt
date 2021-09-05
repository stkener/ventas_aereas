package ar.edu.unahur.obj2.ventasAereas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.date.shouldHaveSameDayAs
import io.kotest.matchers.date.shouldHaveSameMonthAs
import io.kotest.matchers.date.shouldHaveSameYearAs
import io.kotest.matchers.shouldBe
import java.time.LocalDate
import java.util.*

/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////PRIMER PARCIAL OBJETOS 2////////////////////////////////////
//////////////////////////////////KENER SEBASTIAN////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////


class VentaTest : DescribeSpec({
    describe("Test tipo venta pasajes") {
        var avionMedio = Airbus()
        var avionChico = Privado()
        var avionGrande = Boeing()

        var asientosVenta = Estricta()
        var politica = Segura()

        var fechaVueloUno = LocalDate.of(21, 5, 10)
        var fechaVueloDos = LocalDate.of(21, 5, 23)
        var fechaVueloTres = LocalDate.of(21, 6, 24)

        var unVuelo = VueloPasajeros(fechaVueloTres, avionGrande, "argentina", "tahiti", 12, 500, asientosVenta, politica)
        var vueloDos = VueloCharter(fechaVueloTres, avionGrande, "argentina", "alemania", 15, 500, asientosVenta, politica)
        var vueloTres = VueloCarga(fechaVueloTres, avionGrande, "argentina", "eeuu", 8, 500, asientosVenta, politica)

        var fechaPasajes = LocalDate.of(21, 5, 18)

        /////////PASAJEROS////////////
        var pasaje1 = Pasajes(unVuelo, fechaPasajes, 14384656)
        var pasaje2 = Pasajes(unVuelo, fechaPasajes, 14384657)
        var pasaje3 = Pasajes(unVuelo, fechaPasajes, 14384658)
        var pasaje4 = Pasajes(unVuelo, fechaPasajes, 14384659)
        var pasaje5 = Pasajes(unVuelo, fechaPasajes, 14384660)
        var pasaje6 = Pasajes(unVuelo, fechaPasajes, 14384661)
        var pasaje7 = Pasajes(unVuelo, fechaPasajes, 14384662)
        var pasaje8 = Pasajes(unVuelo, fechaPasajes, 14384663)
        var pasaje9 = Pasajes(unVuelo, fechaPasajes, 14384664)
        var pasaje10 = Pasajes(unVuelo, fechaPasajes, 14384665)
        var pasaje11 = Pasajes(unVuelo, fechaPasajes, 14384666)
        var pasaje12 = Pasajes(unVuelo, fechaPasajes, 14384667)
        var pasaje13 = Pasajes(unVuelo, fechaPasajes, 14384668)
        var pasaje14 = Pasajes(unVuelo, fechaPasajes, 14384669)
        var pasaje15 = Pasajes(unVuelo, fechaPasajes, 14384670)
        var pasaje16 = Pasajes(unVuelo, fechaPasajes, 14384671)
        var pasaje17 = Pasajes(unVuelo, fechaPasajes, 14384672)
        var pasaje18 = Pasajes(unVuelo, fechaPasajes, 14384673)
        var pasaje19 = Pasajes(unVuelo, fechaPasajes, 14384674)
        var pasaje20 = Pasajes(unVuelo, fechaPasajes, 14384675)
        var pasaje21 = Pasajes(unVuelo, fechaPasajes, 14384676)
        var pasaje22 = Pasajes(unVuelo, fechaPasajes, 14384677)
        var pasaje23 = Pasajes(unVuelo, fechaPasajes, 14384678)
        var pasaje24 = Pasajes(unVuelo, fechaPasajes, 14384679)
        var pasaje25 = Pasajes(unVuelo, fechaPasajes, 14384680)
        var pasaje26 = Pasajes(unVuelo, fechaPasajes, 14384681)
        var pasaje27 = Pasajes(unVuelo, fechaPasajes, 14384682)
        var pasaje28 = Pasajes(unVuelo, fechaPasajes, 14384683)
        var pasaje29 = Pasajes(unVuelo, fechaPasajes, 14384684)
        var pasaje30 = Pasajes(unVuelo, fechaPasajes, 14384685)
        var pasaje31 = Pasajes(unVuelo, fechaPasajes, 14384686)
        var pasaje32 = Pasajes(unVuelo, fechaPasajes, 14384684)
        var pasaje33 = Pasajes(unVuelo, fechaPasajes, 14384688)
        var pasaje34 = Pasajes(unVuelo, fechaPasajes, 14384689)
        var pasaje35 = Pasajes(unVuelo, fechaPasajes, 14384690)
        var pasaje36 = Pasajes(unVuelo, fechaPasajes, 14384691)
        var pasaje37 = Pasajes(unVuelo, fechaPasajes, 14384692)
        var pasaje38 = Pasajes(unVuelo, fechaPasajes, 14384693)
        var pasaje39 = Pasajes(unVuelo, fechaPasajes, 14384694)
        var pasaje40 = Pasajes(unVuelo, fechaPasajes, 14384695)
        var pasaje41 = Pasajes(unVuelo, fechaPasajes, 14384696)
        var pasaje42 = Pasajes(unVuelo, fechaPasajes, 14384697)

    describe("Requerimiento 1"){
        describe("cantidad de asientos libres de un vuelo"){
            it("cantidad de asientos libres que tiene vuelo pasajeros"){
                unVuelo.pasajesVendidos.add(pasaje40)
                unVuelo.pasajesVendidos.add(pasaje41)
                unVuelo.pasajesVendidos.add(pasaje42)

                unVuelo.asientosLibres().shouldBe(457)
                unVuelo.asientosDisponibles().shouldBe(460)
                unVuelo.asientosOcupados().shouldBe(3)
            }
            it("cantidad de asientos libres que tiene vuelo charter"){
                vueloDos.pasajesVendidos.add(pasaje10)
                vueloDos.pasajesVendidos.add(pasaje11)
                vueloDos.pasajesVendidos.add(pasaje12)

                vueloDos.asientosLibres().shouldBe(432)
                vueloDos.asientosDisponibles().shouldBe(435)
                vueloDos.asientosOcupados().shouldBe(3)
            }
            it("cantidad de asientos libres que tiene vuelo carga"){
                vueloTres.pasajesVendidos.add(pasaje10)
                vueloTres.pasajesVendidos.add(pasaje11)
                vueloTres.pasajesVendidos.add(pasaje12)

                vueloTres.asientosLibres().shouldBe(7)
                vueloTres.asientosDisponibles().shouldBe(10)
                vueloTres.asientosOcupados().shouldBe(3)
            }
        }
    }

    describe("Requerimiento 2"){
        describe("Si un vuelo es relajado o no"){
            it("si es relajado devuelve true, caso contrario devuelve false"){
                vueloDos.cambiarAvion(avionMedio)
                vueloTres.cambiarAvion(avionChico)

                unVuelo.esRelajado().shouldBe(false)
                vueloDos.esRelajado().shouldBe(false)
                vueloTres.esRelajado().shouldBe(true)
            }
        }
    }

    describe("Requerimiento 3"){
        describe("si un paaje se puede vender o no de a cuerdo a una politica"){

            var segura = Segura()
            var laxaFija = LaxaFija()
            var laxaPorcentual = LaxaPorcentual()
            var pandemia = Pandemia() // no realice otra prueba xq siempre va dar falso

        it("se puede vender avion vacio") {
            segura.sePuedeVender(unVuelo).shouldBe(true)
            laxaFija.sePuedeVender(unVuelo).shouldBe(true)
            laxaPorcentual.sePuedeVender(unVuelo).shouldBe(true)
            pandemia.sePuedeVender(unVuelo).shouldBe(false)
        }
        it("se puede vender avion lleno venta segura"){
            unVuelo.unAvion.asientos = 10
            unVuelo.asientosDisponibles().shouldBe(10)
            unVuelo.pasajesVendidos.add(pasaje1)
            unVuelo.pasajesVendidos.add(pasaje2)
            unVuelo.pasajesVendidos.add(pasaje3)
            unVuelo.pasajesVendidos.add(pasaje4)
            unVuelo.pasajesVendidos.add(pasaje5)
            unVuelo.pasajesVendidos.add(pasaje6)
            unVuelo.pasajesVendidos.add(pasaje7)
            unVuelo.pasajesVendidos.add(pasaje8)

            unVuelo.sePuedeVender().shouldBe(false)
        }
        it("se puede vender avion lleno venta laxa fija"){
            unVuelo.cambiarPoliticaVenta(laxaFija)

            unVuelo.unAvion.asientos = 10
            unVuelo.asientosDisponibles().shouldBe(10)

            unVuelo.pasajesVendidos.add(pasaje1)
            unVuelo.pasajesVendidos.add(pasaje2)
            unVuelo.pasajesVendidos.add(pasaje3)
            unVuelo.pasajesVendidos.add(pasaje4)
            unVuelo.pasajesVendidos.add(pasaje5)
            unVuelo.pasajesVendidos.add(pasaje6)
            unVuelo.pasajesVendidos.add(pasaje7)
            unVuelo.pasajesVendidos.add(pasaje8)

            //disponibles 0, pero permite vender 10 mas
            unVuelo.sePuedeVender().shouldBe(true)
            laxaFija.sePuedeVender(unVuelo).shouldBe(true)//prueba a la clase

            unVuelo.pasajesVendidos.add(pasaje20)
            unVuelo.pasajesVendidos.add(pasaje21)
            unVuelo.pasajesVendidos.add(pasaje22)
            unVuelo.pasajesVendidos.add(pasaje23)
            unVuelo.pasajesVendidos.add(pasaje24)
            unVuelo.pasajesVendidos.add(pasaje25)
            unVuelo.pasajesVendidos.add(pasaje26)
            unVuelo.pasajesVendidos.add(pasaje27)
            unVuelo.pasajesVendidos.add(pasaje28)
            unVuelo.pasajesVendidos.add(pasaje29)

            // disponible 0 y lista de pasajeros con 10
            unVuelo.sePuedeVender().shouldBe(true)
            laxaFija.sePuedeVender(unVuelo).shouldBe(true)

            unVuelo.pasajesVendidos.add(pasaje30)
            unVuelo.pasajesVendidos.add(pasaje31)
            unVuelo.pasajesVendidos.add(pasaje32)
            unVuelo.pasajesVendidos.add(pasaje33)
            unVuelo.pasajesVendidos.add(pasaje34)
            unVuelo.pasajesVendidos.add(pasaje35)
            unVuelo.pasajesVendidos.add(pasaje36)
            unVuelo.pasajesVendidos.add(pasaje37)
            unVuelo.pasajesVendidos.add(pasaje38)
            unVuelo.pasajesVendidos.add(pasaje39)

            // disponible 0 y lista de pasajeros 20
            unVuelo.sePuedeVender().shouldBe(false)
            laxaFija.sePuedeVender(unVuelo).shouldBe(false)
            }
        it("se puede vender avion lleno venta laxa porcentual"){
            unVuelo.cambiarPoliticaVenta(laxaPorcentual)

            unVuelo.unAvion.asientos = 10
            unVuelo.asientosDisponibles().shouldBe(10)

            unVuelo.pasajesVendidos.add(pasaje1)
            unVuelo.pasajesVendidos.add(pasaje2)
            unVuelo.pasajesVendidos.add(pasaje3)
            unVuelo.pasajesVendidos.add(pasaje4)
            unVuelo.pasajesVendidos.add(pasaje5)
            unVuelo.pasajesVendidos.add(pasaje6)
            unVuelo.pasajesVendidos.add(pasaje7)
            unVuelo.pasajesVendidos.add(pasaje8)
            unVuelo.pasajesVendidos.add(pasaje9)
            unVuelo.pasajesVendidos.add(pasaje10)


            //disponibles 0, pero permite vender 1 mas(10%)
            unVuelo.sePuedeVender().shouldBe(true)
            laxaPorcentual.sePuedeVender(unVuelo).shouldBe(true)

            unVuelo.pasajesVendidos.add(pasaje20)

            // disponible 0 y lista de pasajeros con 10
            unVuelo.sePuedeVender().shouldBe(false)
            laxaPorcentual.sePuedeVender(unVuelo).shouldBe(false)

            }
        }
    }

    describe("Requerimiento 4"){
        describe("Precio de venta para un vuelo"){

           it("venta asiento estricta, precio estandar"){
                unVuelo.precioPasaje().shouldBe(500)
            }

            it("venta asiento anticipada, precio al 30, menos de 40 pasajes vendidos, 30%"){
                var nuevaVenta = VentaAnticipada()

                unVuelo.cambiarVentaAsientos(nuevaVenta)

                unVuelo.precioPasaje().shouldBe(150)

            }

            it("venta asiento anticipada, precio al 60, entre 40 y 79 pasajes vendidos, 60%") {
                var nuevaVenta = VentaAnticipada()

                unVuelo.cambiarVentaAsientos(nuevaVenta)

                while(unVuelo.asientosOcupados() < 50 && unVuelo.asientosOcupados() < unVuelo.asientosDisponibles()){ unVuelo.pasajesVendidos.add(pasaje13) }

                unVuelo.precioPasaje().shouldBe(300)

            }

            it("venta asiento anticipada, precio estandar") {
                var nuevaVenta = VentaAnticipada()

                unVuelo.cambiarVentaAsientos(nuevaVenta)

                while(unVuelo.asientosOcupados() < 85 && unVuelo.asientosOcupados() < unVuelo.asientosDisponibles()){ unVuelo.pasajesVendidos.add(pasaje14) }

                unVuelo.precioPasaje().shouldBe(500)

            }

            it("venta asiento Remate, 30 asientos libres el 25% del precio, si no el 50%."){
                var nuevaVenta = Remate()

                unVuelo.cambiarVentaAsientos(nuevaVenta)

                unVuelo.precioPasaje().shouldBe(125)

                while(unVuelo.asientosOcupados() < 440 && unVuelo.asientosOcupados() < unVuelo.asientosDisponibles()){ unVuelo.pasajesVendidos.add(pasaje14) }

                unVuelo.precioPasaje().shouldBe(250)
            }

        }
    }

    describe("Requerimiento 5"){

        /*ACLARACION: Hay unos pasajes prearmados, asi mismo hay dos variedades de la funcion
        venderPasajes, la primera(que es la que esta habilitada en este momento) nos pide como dato
        fecha de venta y dni del pasajero, la segunda(es donde funcionarian los pasajes armados) acepta como parametro
       pasajes armados fuera de la funcion y los agrega al vuelo
       */

        var pandemia = Pandemia()
        var laxaFija = LaxaFija()

        unVuelo.venderPasajes(fechaPasajes, 14384656)
        unVuelo.asientosOcupados().shouldBe(1)

        //CAMBIO DE POLITICA. DA ERROR
        /*unVuelo.cambiarPoliticaVenta(pandemia)
        unVuelo.venderPasajes(180521, 14384657)*/

        //CAMBIO DE POLITICA.
        unVuelo.unAvion.asientos = 5
        unVuelo.cambiarPoliticaVenta(laxaFija)

        unVuelo.venderPasajes(fechaPasajes, 14384657)
        unVuelo.venderPasajes(fechaPasajes, 14384658)
        unVuelo.venderPasajes(fechaPasajes, 14384659)
        unVuelo.venderPasajes(fechaPasajes, 14384660)
        unVuelo.venderPasajes(fechaPasajes, 14384661)

        unVuelo.asientosOcupados().shouldBe(6)

    }

    describe("Requerimiento 6"){
        it("Recaudacion del vuelo"){
        unVuelo.venderPasajes(fechaPasajes, 14384656)
        unVuelo.venderPasajes(fechaPasajes, 14384657)
        unVuelo.venderPasajes(fechaPasajes, 14384658)
        unVuelo.venderPasajes(fechaPasajes, 14384659)
        unVuelo.venderPasajes(fechaPasajes, 14384660)
        unVuelo.venderPasajes(fechaPasajes, 14384661)

        unVuelo.montoTotalVuelo().shouldBe(3000)
        }
    }

    describe("Requerimiento 7"){
        it("peso maximo vuelo pasajeros"){

        unVuelo.venderPasajes(fechaPasajes, 14384656)
        unVuelo.venderPasajes(fechaPasajes, 14384657)
        unVuelo.venderPasajes(fechaPasajes, 14384658)
        unVuelo.venderPasajes(fechaPasajes, 14384659)
        unVuelo.venderPasajes(fechaPasajes, 14384660)
        unVuelo.venderPasajes(fechaPasajes, 14384661)

        unVuelo.pesoMaximo().shouldBe(150600)
        }
        it("peso maximo vuelo Carga"){
            vueloTres.pesoBultos = 500

            vueloTres.venderPasajes(fechaPasajes, 14384656)
            vueloTres.venderPasajes(fechaPasajes, 14384657)
            vueloTres.venderPasajes(fechaPasajes, 14384658)
            vueloTres.venderPasajes(fechaPasajes, 14384659)
            vueloTres.venderPasajes(fechaPasajes, 14384660)
            vueloTres.venderPasajes(fechaPasajes, 14384661)

            vueloTres.pesoMaximo().shouldBe(151740)
        }
        it("peso maximo vuelo Charter"){

            vueloDos.venderPasajes(fechaPasajes, 14384656)
            vueloDos.venderPasajes(fechaPasajes, 14384657)
            vueloDos.venderPasajes(fechaPasajes, 14384658)
            vueloDos.venderPasajes(fechaPasajes, 14384659)
            vueloDos.venderPasajes(fechaPasajes, 14384660)
            vueloDos.venderPasajes(fechaPasajes, 14384661)

            vueloDos.pesoMaximo().shouldBe(155540)
        }
     }

    describe("Requerimiento 8"){
        unVuelo.pasajesVendidos.add(pasaje1)
        unVuelo.pasajesVendidos.add(pasaje2)
        unVuelo.pasajesVendidos.add(pasaje3)
        unVuelo.pasajesVendidos.add(pasaje4)
        unVuelo.pasajesVendidos.add(pasaje5)
        unVuelo.pasajesVendidos.add(pasaje6)
        unVuelo.pasajesVendidos.add(pasaje7)
        unVuelo.pasajesVendidos.add(pasaje8)
        unVuelo.pasajesVendidos.add(pasaje9)
        unVuelo.pasajesVendidos.add(pasaje10)

        vueloDos.pasajesVendidos.add(pasaje11)
        vueloDos.pasajesVendidos.add(pasaje12)
        vueloDos.pasajesVendidos.add(pasaje13)
        vueloDos.pasajesVendidos.add(pasaje14)
        vueloDos.pasajesVendidos.add(pasaje15)
        vueloDos.pasajesVendidos.add(pasaje16)
        vueloDos.pasajesVendidos.add(pasaje17)
        vueloDos.pasajesVendidos.add(pasaje18)
        vueloDos.pasajesVendidos.add(pasaje19)
        vueloDos.pasajesVendidos.add(pasaje20)

        vueloTres.pasajesVendidos.add(pasaje31)
        vueloTres.pasajesVendidos.add(pasaje32)
        vueloTres.pasajesVendidos.add(pasaje33)
        vueloTres.pasajesVendidos.add(pasaje34)
        vueloTres.pasajesVendidos.add(pasaje35)
        vueloTres.pasajesVendidos.add(pasaje36)
        vueloTres.pasajesVendidos.add(pasaje37)
        vueloTres.pasajesVendidos.add(pasaje38)
        vueloTres.pasajesVendidos.add(pasaje39)
        vueloTres.pasajesVendidos.add(pasaje40)

    var primeraCentral = CentralVuelos()

        primeraCentral.agregarVuelo(unVuelo)
        primeraCentral.agregarVuelo(vueloDos)
        primeraCentral.agregarVuelo(vueloTres)

        primeraCentral.listaVuelos.size.shouldBe(3)

    it(" prueba de fx cuando vuelo, dado un destino y un dni devuelve la fecha del vuelo"){
        var unaFecha = LocalDate.of(21, 5, 23)
        var otraFecha = LocalDate.of(1, 1, 1)
        var fechaDos = LocalDate.of(21, 5, 10)
        var fechaTres = LocalDate.of(21, 6, 24)


        primeraCentral.cuandoVuelo(14384675, "alemania").isEqual(fechaDos)


        }
    }

    describe("Requerimiento 9"){
        var fechaUno = LocalDate.of(21,1, 10)
        var fechaDos = LocalDate.of(21, 6, 6)
        var fechaTres = LocalDate.of(21,5, 20)
        var fechaCuatro = LocalDate.of(21,6, 3)
        var fechaCinco = LocalDate.of(21,5, 23)

        var vueloCinco = VueloPasajeros(fechaUno, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloSeis = VueloPasajeros(fechaDos, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloSiete = VueloPasajeros(fechaTres, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloOcho = VueloPasajeros(fechaCuatro, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloNueve = VueloPasajeros(fechaCinco, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloDiez = VueloPasajeros(fechaTres, avionGrande, "argentina", "berlin", 12, 500, asientosVenta, politica)

        vueloCinco.pasajesVendidos.add(pasaje1)
        vueloCinco.pasajesVendidos.add(pasaje2)
        vueloCinco.pasajesVendidos.add(pasaje3)
        vueloCinco.pasajesVendidos.add(pasaje4)
        vueloCinco.pasajesVendidos.add(pasaje5)
        vueloCinco.pasajesVendidos.add(pasaje6)
        vueloCinco.pasajesVendidos.add(pasaje7)
        vueloCinco.pasajesVendidos.add(pasaje8)
        vueloCinco.pasajesVendidos.add(pasaje9)
        vueloCinco.pasajesVendidos.add(pasaje10)

        vueloSeis.pasajesVendidos.add(pasaje1)
        vueloSeis.pasajesVendidos.add(pasaje2)
        vueloSeis.pasajesVendidos.add(pasaje3)
        vueloSeis.pasajesVendidos.add(pasaje4)
        vueloSeis.pasajesVendidos.add(pasaje5)
        vueloSeis.pasajesVendidos.add(pasaje6)
        vueloSeis.pasajesVendidos.add(pasaje7)
        vueloSeis.pasajesVendidos.add(pasaje8)
        vueloSeis.pasajesVendidos.add(pasaje9)
        vueloSeis.pasajesVendidos.add(pasaje10)

        vueloSiete.pasajesVendidos.add(pasaje1)
        vueloSiete.pasajesVendidos.add(pasaje2)
        vueloSiete.pasajesVendidos.add(pasaje3)
        vueloSiete.pasajesVendidos.add(pasaje4)
        vueloSiete.pasajesVendidos.add(pasaje5)
        vueloSiete.pasajesVendidos.add(pasaje6)
        vueloSiete.pasajesVendidos.add(pasaje7)
        vueloSiete.pasajesVendidos.add(pasaje8)
        vueloSiete.pasajesVendidos.add(pasaje9)
        vueloSiete.pasajesVendidos.add(pasaje10)

        vueloOcho.pasajesVendidos.add(pasaje1)
        vueloOcho.pasajesVendidos.add(pasaje2)
        vueloOcho.pasajesVendidos.add(pasaje3)
        vueloOcho.pasajesVendidos.add(pasaje4)
        vueloOcho.pasajesVendidos.add(pasaje5)
        vueloOcho.pasajesVendidos.add(pasaje6)
        vueloOcho.pasajesVendidos.add(pasaje7)
        vueloOcho.pasajesVendidos.add(pasaje8)
        vueloOcho.pasajesVendidos.add(pasaje9)
        vueloOcho.pasajesVendidos.add(pasaje10)

        vueloNueve.pasajesVendidos.add(pasaje1)
        vueloNueve.pasajesVendidos.add(pasaje2)
        vueloNueve.pasajesVendidos.add(pasaje3)
        vueloNueve.pasajesVendidos.add(pasaje4)
        vueloNueve.pasajesVendidos.add(pasaje5)
        vueloNueve.pasajesVendidos.add(pasaje6)
        vueloNueve.pasajesVendidos.add(pasaje7)
        vueloNueve.pasajesVendidos.add(pasaje8)
        vueloNueve.pasajesVendidos.add(pasaje9)
        vueloNueve.pasajesVendidos.add(pasaje10)

        vueloDiez.pasajesVendidos.add(pasaje1)
        vueloDiez.pasajesVendidos.add(pasaje2)
        vueloDiez.pasajesVendidos.add(pasaje3)
        vueloDiez.pasajesVendidos.add(pasaje4)
        vueloDiez.pasajesVendidos.add(pasaje5)
        vueloDiez.pasajesVendidos.add(pasaje6)
        vueloDiez.pasajesVendidos.add(pasaje7)
        vueloDiez.pasajesVendidos.add(pasaje8)
        vueloDiez.pasajesVendidos.add(pasaje9)
        vueloDiez.pasajesVendidos.add(pasaje10)


        var nuevaCentral = CentralVuelos()

        nuevaCentral.agregarVuelo(vueloCinco)
        nuevaCentral.agregarVuelo(vueloSeis)
        nuevaCentral.agregarVuelo(vueloSiete)
        nuevaCentral.agregarVuelo(vueloOcho)
        nuevaCentral.agregarVuelo(vueloNueve)
        nuevaCentral.agregarVuelo(vueloDiez)

        var fechaMenor = LocalDate.of(21,5, 15)
        var fechaMayor = LocalDate.of(21,6, 10)

        it("cantidad de asientos libres entre fechas para cierto destino") {
            nuevaCentral.asientosLibresEntre("rusia", fechaMenor, fechaMayor).shouldBe(1800)
        }
    }

    describe("Requerimiento 10"){

        var fechaUno = LocalDate.of(21,1, 10)
        var fechaDos = LocalDate.of(21, 6, 6)
        var fechaTres = LocalDate.of(21,5, 20)
        var fechaCuatro = LocalDate.of(21,6, 3)
        var fechaCinco = LocalDate.of(21,5, 23)

        var vueloCinco = VueloPasajeros(fechaUno, avionGrande, "argentina", "china", 12, 500, asientosVenta, politica)
        var vueloSeis = VueloPasajeros(fechaDos, avionGrande, "argentina", "australia", 12, 500, asientosVenta, politica)
        var vueloSiete = VueloPasajeros(fechaTres, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloOcho = VueloPasajeros(fechaCuatro, avionGrande, "argentina", "sudafrica", 12, 500, asientosVenta, politica)
        var vueloNueve = VueloPasajeros(fechaCinco, avionGrande, "argentina", "rusia", 12, 500, asientosVenta, politica)
        var vueloDiez = VueloPasajeros(fechaTres, avionGrande, "argentina", "berlin", 12, 500, asientosVenta, politica)

        vueloCinco.pasajesVendidos.add(pasaje1)
        vueloCinco.pasajesVendidos.add(pasaje2)
        vueloCinco.pasajesVendidos.add(pasaje3)
        vueloCinco.pasajesVendidos.add(pasaje4)
        vueloCinco.pasajesVendidos.add(pasaje5)
        vueloCinco.pasajesVendidos.add(pasaje6)
        vueloCinco.pasajesVendidos.add(pasaje7)
        vueloCinco.pasajesVendidos.add(pasaje8)
        vueloCinco.pasajesVendidos.add(pasaje9)
        vueloCinco.pasajesVendidos.add(pasaje10)

        vueloSeis.pasajesVendidos.add(pasaje1)
        vueloSeis.pasajesVendidos.add(pasaje2)
        vueloSeis.pasajesVendidos.add(pasaje11)
        vueloSeis.pasajesVendidos.add(pasaje12)
        vueloSeis.pasajesVendidos.add(pasaje13)
        vueloSeis.pasajesVendidos.add(pasaje14)
        vueloSeis.pasajesVendidos.add(pasaje15)
        vueloSeis.pasajesVendidos.add(pasaje16)
        vueloSeis.pasajesVendidos.add(pasaje17)
        vueloSeis.pasajesVendidos.add(pasaje18)

        vueloSiete.pasajesVendidos.add(pasaje19)
        vueloSiete.pasajesVendidos.add(pasaje20)
        vueloSiete.pasajesVendidos.add(pasaje21)
        vueloSiete.pasajesVendidos.add(pasaje22)
        vueloSiete.pasajesVendidos.add(pasaje23)
        vueloSiete.pasajesVendidos.add(pasaje24)
        vueloSiete.pasajesVendidos.add(pasaje25)
        vueloSiete.pasajesVendidos.add(pasaje26)
        vueloSiete.pasajesVendidos.add(pasaje1)
        vueloSiete.pasajesVendidos.add(pasaje2)

        vueloOcho.pasajesVendidos.add(pasaje1)
        vueloOcho.pasajesVendidos.add(pasaje2)
        vueloOcho.pasajesVendidos.add(pasaje27)
        vueloOcho.pasajesVendidos.add(pasaje28)
        vueloOcho.pasajesVendidos.add(pasaje29)
        vueloOcho.pasajesVendidos.add(pasaje30)
        vueloOcho.pasajesVendidos.add(pasaje31)
        vueloOcho.pasajesVendidos.add(pasaje32)
        vueloOcho.pasajesVendidos.add(pasaje33)
        vueloOcho.pasajesVendidos.add(pasaje34)

        vueloNueve.pasajesVendidos.add(pasaje1)
        vueloNueve.pasajesVendidos.add(pasaje2)
        vueloNueve.pasajesVendidos.add(pasaje35)
        vueloNueve.pasajesVendidos.add(pasaje36)
        vueloNueve.pasajesVendidos.add(pasaje37)
        vueloNueve.pasajesVendidos.add(pasaje38)
        vueloNueve.pasajesVendidos.add(pasaje39)
        vueloNueve.pasajesVendidos.add(pasaje40)
        vueloNueve.pasajesVendidos.add(pasaje41)
        vueloNueve.pasajesVendidos.add(pasaje42)

        vueloDiez.pasajesVendidos.add(pasaje1)
        vueloDiez.pasajesVendidos.add(pasaje2)
        vueloDiez.pasajesVendidos.add(pasaje31)
        vueloDiez.pasajesVendidos.add(pasaje41)
        vueloDiez.pasajesVendidos.add(pasaje35)
        vueloDiez.pasajesVendidos.add(pasaje26)
        vueloDiez.pasajesVendidos.add(pasaje17)
        vueloDiez.pasajesVendidos.add(pasaje18)
        vueloDiez.pasajesVendidos.add(pasaje29)
        vueloDiez.pasajesVendidos.add(pasaje10)

        var nuevaCentral = CentralVuelos()

        nuevaCentral.agregarVuelo(vueloCinco)
        nuevaCentral.agregarVuelo(vueloSeis)
        nuevaCentral.agregarVuelo(vueloSiete)
        nuevaCentral.agregarVuelo(vueloOcho)
        nuevaCentral.agregarVuelo(vueloNueve)
        nuevaCentral.agregarVuelo(vueloDiez)

        it("saber si dos personas son compañeros"){

            nuevaCentral.sonCompanieros(14384656, 14384657).shouldBe(true)
            nuevaCentral.sonCompanieros(14384656, 14384660).shouldBe(false)
        }
    }
    }
})




