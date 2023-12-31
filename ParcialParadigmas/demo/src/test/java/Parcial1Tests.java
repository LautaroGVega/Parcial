import com.example.AVAR;
import com.example.Arbitro;
import com.example.AsistenteDeVideo;
import com.example.Equipo;
import com.example.Estadio;
import com.example.IImprimible;
import com.example.IJugador;
import com.example.Jugador;
import com.example.PantallaLed;
import com.example.Partido;
import com.example.TarjetaAmarilla;
import com.example.TarjetaBase;
import com.example.TarjetaRoja;
import com.example.Torneo;
import com.example.Var;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

////import java.util.ArrayList;
///import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;

//import org.junit.Assert;
import org.junit.Test;



    public class Parcial1Tests {

    @Test
    public void torneo_agregar_equipos_parcial_ejercicio_ejemplo_01()
    {
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");

        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");

        torneo.agregar(boca);        
        torneo.agregar(palmeiras);


        assertEquals("Boca Juniors", boca.getName());            
        assertEquals("BOC", boca.getAbreviatura());        
    
        assertEquals("Palmeiras", palmeiras.getName());  
        assertEquals("PAL", palmeiras.getAbreviatura());        
        
        assertEquals(2, torneo.equiposCantidad());
    }
    @Test
    public void torneo_agregar_partidos_parcial_ejercicio_ejemplo_02()
    {
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");

        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");
        Equipo internacional = new Equipo("Internacional", "INT");        
        Equipo fluminense = new Equipo("Fluminense", "FLU");

        torneo.agregar(boca);        
        torneo.agregar(palmeiras);
        torneo.agregar(internacional);        
        torneo.agregar(fluminense);
            
        Partido partido1Ida = new Partido(estadioBombonera, internacional, fluminense, "Semifinal Partido Ida");
        Partido partido1Vuelta = new Partido(estadioBombonera, fluminense, internacional, "Semifinal Partido Vuelta");   

        Partido partido2Ida = new Partido(estadioBombonera, palmeiras, boca, "Semifinal Partido Ida");
        Partido partido2Vuelta = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    

        
        torneo.agregar(partido1Ida);
        torneo.agregar(partido2Vuelta);

        torneo.agregar(partido2Ida);
        torneo.agregar(partido2Vuelta);

        assertEquals(4, torneo.partidosCantidad());  
        assertEquals("Semifinal Partido Ida INTxFLU", partido1Ida.getName());        
        assertEquals("Semifinal Partido Vuelta FLUxINT", partido1Vuelta.getName());      
        assertEquals("Semifinal Partido Ida PALxBOC", partido2Ida.getName());        
        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido2Vuelta.getName());

    }
    @Test
    public void torneo_agregar_jugadores_a_un_equipo_parcial_ejercicio_ejemplo_03()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");          
        
        Jugador jugador10 = new Jugador("Edinson Cavani", 10);   
        Jugador jugador19 = new Jugador("Valentin Barco", 19);
  
        boca.agregar(jugador10);         
        boca.agregar(jugador19); 

        assertEquals(2, boca.jugadoresCantidad());          
        
        assertEquals("Edinson Cavani", boca.obtenerJugador(10).getName());          
        assertEquals("Valentin Barco", boca.obtenerJugador(19).getName());  

    }
        @Test
    public void torneo_sacar_tarjeta_roja_a_un_jugador_en_un_partido_parcial_ejercicio_ejemplo_04()
    {        
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
        
        Jugador jugador10 = new Jugador("Edinson Cavani", 10);   
        Jugador jugador19 = new Jugador("Valentin Barco", 19);
  
        boca.agregar(jugador10);         
        boca.agregar(jugador19); 

        Partido partidoIda = new Partido(estadioBombonera, palmeiras, boca, "Semifinal Partido Ida");    

        TarjetaBase tarjetaRojaParaJugador10DeBoca = new TarjetaRoja(jugador10);

        partidoIda.agregar(tarjetaRojaParaJugador10DeBoca);

        assertEquals(1, partidoIda.tarjetasCantidad());          
        
        assertEquals("ROJA", partidoIda.getTarjetas().get(0).getColor());           
        assertEquals("Edinson Cavani", partidoIda.getTarjetas().get(0).getJugador().getName());   


    }
    @Test
    public void estadio_se_debe_crear_en_una_ubicacion_parcial_ejercicio_ejemplo_05()
    {                
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");


        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());


    }
    @Test
    public void un_partido_debe_disputarse_en_un_estadio_en_una_fecha_parcial_ejercicio_ejemplo_06()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");  
       
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        assertEquals("La Bombonera", estadioBombonera.getName());

        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());


        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido.getName());        
        assertEquals("La Bombonera, Buenos Aires (Argentina)", partido.getEstadio().toString());          
         
    }
    @Test
    public void tarjeta_roja_y_amarilla_parcial_ejercicio_ejemplo_07()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);


        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        


        Jugador jugadorPalmeiras10 = new Jugador("Rony", 10);


        palmeiras.agregar(jugadorPalmeiras10);


        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);




        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);

        assertEquals(3, partido.tarjetasCantidad());    


        assertEquals("ROJA", partido.getTarjetas().get(0).getColor());  
        assertEquals(6, partido.getTarjetas().get(0).getJugador().getNumero());                
        assertEquals("Marcos Rojo", partido.getTarjetas().get(0).getJugador().getName());  
         
         
        assertEquals("AMARILLA", partido.getTarjetas().get(1).getColor());  
        assertEquals(10, partido.getTarjetas().get(1).getJugador().getNumero());                
        assertEquals("Edinson Cavani", partido.getTarjetas().get(1).getJugador().getName());


         
        assertEquals("AMARILLA", partido.getTarjetas().get(2).getColor());  
        assertEquals(10, partido.getTarjetas().get(2).getJugador().getNumero());                
        assertEquals("Rony", partido.getTarjetas().get(2).getJugador().getName());
 


    }
    @Test
    public void el_var_obtiene_solo_tarjetas_amarillas_del_partido_parcial_ejercicio_ejemplo_07()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);


        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        


        Jugador jugadorPalmeiras10 = new Jugador("Rony", 10);


        palmeiras.agregar(jugadorPalmeiras10);


        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);




        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);




        Var elVar  = new Var(partido);




        assertEquals(3, partido.tarjetasCantidad());    
       
        assertEquals(1, elVar.cantidadTarjetasRojas());        
        assertEquals(2, elVar.cantidadTarjetasAmarillas());




 


    }
    @Test
    public void equipo_plantel_parcial_ejercicio_ejemplo_09()
    {        
        String resultadoEsperado = "[6] Marcos Rojo (Defensor), [10] Edinson Cavani (Ataque), [19] Valentin Barco (Volante)";


        Equipo boca = new Equipo("Boca Juniors", "BOC");          
       
       
        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);
       
        //Agregamos en diferente al orden numerico de la camiseta
        boca.agregar(jugadorBoca6);        
        boca.agregar(jugadorBoca19);                  
        boca.agregar(jugadorBoca10);      
       
        jugadorBoca6.setPosicion("Defensor");        
        jugadorBoca10.setPosicion("Ataque");
        jugadorBoca19.setPosicion("Volante");
       
        assertEquals(resultadoEsperado, boca.imprimirPlantel());


    }
    @Test
    public void el_var_obtiene_solo_tarjetas_de_un_equipo_parcial_ejercicio_ejemplo_08()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);


        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        


        IJugador jugadorPalmeiras10 = new Jugador("Rony", 10);


        palmeiras.agregar(jugadorPalmeiras10);


        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);




        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);




        Var elVar  = new Var(partido);




        assertEquals(3, partido.tarjetasCantidad());    
       
        assertEquals(2, elVar.cantidadTarjetas(boca));        
        assertEquals(1, elVar.cantidadTarjetas(palmeiras));
 


    }
    @Test
    public void pantallas_estadio_parcial_ejercicio_ejemplo_10()
    {        
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        jugadorBoca6.setPosicion("Defensor");


        Equipo boca = new Equipo("Boca Juniors", "BOC");          
     
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       


        PantallaLed pantallaLed = new PantallaLed();


       
        assertEquals("[Jugador 6] Marcos Rojo > Defensor", pantallaLed.imprimir((IImprimible)jugadorBoca6));        
        assertEquals("[Equipo] Boca Juniors > BOC", pantallaLed.imprimir((IImprimible)boca));
        assertEquals("[Estadio] La Bombonera (Buenos Aires - Argentina)", pantallaLed.imprimir((IImprimible)estadioBombonera));
    }
    @Test
    public void testInstanciarArbitros() {
        // Configurar los objetos necesarios para el test
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");  
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta"); 
        Arbitro arbitro = new Arbitro("Árbitro Principal");
        AsistenteDeVideo arbitroAsistente = new AsistenteDeVideo("Asistente de Video");
        Arbitro arbitroLinea1 = new Arbitro("Árbitro de Línea 1");
        Arbitro arbitroLinea2 = new Arbitro("Árbitro de Línea 2");

        // Configurar el objeto Var con los árbitros
        Var var = new Var(partido);
        var.setAsistenteDeVideo(arbitroAsistente);
        var.setArbitro(arbitro);
        var.setArbitroLinea(List.of(arbitroLinea1, arbitroLinea2));

        // Verificar si los árbitros están configurados correctamente
        assertEquals(arbitro, var.getArbitro());
        assertEquals(arbitroAsistente, var.getAsistenteDeVideo());
        assertEquals(2, var.getArbitroLinea().size()); // Verificar que haya 2 árbitros de línea
        assertEquals(arbitroLinea1, var.getArbitroLinea().get(0));
        assertEquals(arbitroLinea2, var.getArbitroLinea().get(1));
    }
    @Test
    public void testVarCantidadDeTarjetas() {
        // Configurar los objetos necesarios para el test
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");  
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta"); 
        Arbitro arbitro = new Arbitro("Árbitro Principal");
        AsistenteDeVideo arbitroAsistente = new AsistenteDeVideo("Asistente de Video");
        Arbitro arbitroLinea1 = new Arbitro("Árbitro de Línea 1");
        Arbitro arbitroLinea2 = new Arbitro("Árbitro de Línea 2");
        
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);
        boca.agregar(jugadorBoca19);
        arbitro.agregarTarjetaAmarilla(jugadorBoca19, partido);
        arbitro.agregarTarjetaAmarilla(jugadorBoca19, partido);
        arbitro.agregarTarjetaRoja(jugadorBoca19, partido);
         
        // Configurar el objeto Var con los árbitros
        Var var = new Var(partido);
        var.setAsistenteDeVideo(arbitroAsistente);
        var.setArbitro(arbitro);
        var.setArbitroLinea(List.of(arbitroLinea1, arbitroLinea2));

        // Verificar si los árbitros están configurados correctamente
        assertEquals(arbitro, var.getArbitro());
        assertEquals(2, var.cantidadTarjetasAmarillas()); 
        assertEquals(1, var.cantidadTarjetasRojas());    
       
        assertEquals(3, var.cantidadTarjetas(boca));        
        // El arbitro debe asignas una tarjeta a un jugador o vincular 
    }
    @Test
    public void CantidadDeTartjetasEnPartidoTest(){
    Estadio estadio = new Estadio("nombre estadio", "nombre ciudad", "nombre pais");
    Equipo equipoLocal = new Equipo("equipo local", "LOC") ;
    Equipo equipoVisitante = new Equipo("equipo visitante", "VIS") ;
    Arbitro arbitro = new Arbitro("arbitro");
    Arbitro arbitroLinea1 = new Arbitro("arbitro linea 1");
    Arbitro arbitroLinea2 = new Arbitro("arbitro linea 2");
    Arbitro arbitroAsistente = new Arbitro("arbitro asistente");
    List<Arbitro> arbitrosLinea = new ArrayList<>();
    arbitrosLinea.add(arbitroLinea1);
    arbitrosLinea.add(arbitroLinea2);
    Partido partido = new Partido(estadio, equipoLocal, equipoVisitante, "nombre partido", arbitro, arbitrosLinea, arbitroAsistente);

    assertEquals(estadio, partido.getEstadio());
    assertEquals(equipoLocal, partido.getEquipoLocal());
    assertEquals(equipoVisitante, partido.getEquipoVisitante());
    assertEquals(arbitro, partido.getArbitro());
    assertEquals(arbitrosLinea, partido.getArbitroLinea());
    assertEquals(arbitroAsistente, partido.getArbitroAsistente());
    
    AsistenteDeVideo asistenteDeVideo = new AsistenteDeVideo("asistente de video");
    AVAR aVar1 = new AVAR("aVAR1");
    AVAR aVar2 = new AVAR("aVAR2");
    AVAR aVar3 = new AVAR("aVAR3");
    Var var = new Var(partido, asistenteDeVideo, aVar1, aVar2, aVar3);

    IJugador jugador = new Jugador("jugador", 1);
    equipoLocal.agregar(jugador);
    TarjetaAmarilla tarjetaAmarilla1 = new TarjetaAmarilla(jugador);
    TarjetaAmarilla tarjetaAmarilla2 = new TarjetaAmarilla(jugador);
    TarjetaRoja tarjetaRoja = new TarjetaRoja(jugador);
    partido.agregar(tarjetaAmarilla1);
    partido.agregar(tarjetaAmarilla2);
    partido.agregar(tarjetaRoja);

    assertEquals(2, var.cantidadTarjetasAmarillas());
    assertEquals(1, var.cantidadTarjetasRojas());
    assertEquals(3, var.cantidadTarjetas(equipoLocal));
    }
    /*  @Test
    public void comprobarCantidadDeTarjetasPorJugadorDeBocaPredict() {
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);
    
        boca.agregar(jugadorBoca6);
        boca.agregar(jugadorBoca10);
        boca.agregar(jugadorBoca19);
    
        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);
    
        Partido partido = new Partido(new Estadio("La Bombonera", "Buenos Aires", "Argentina"), boca, null, "Semifinal Partido Vuelta");
    
        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
    
        Var elVar = new Var(partido);
    
        assertEquals(1, elVar.cantidadTarjetas(jugadorBoca6));
        assertEquals(1, elVar.cantidadTarjetas(jugadorBoca10));
        assertEquals(0, elVar.cantidadTarjetas(jugadorBoca19));
    }
    @Test
public void comprobarJugadoresConTarjetaAmarillaPredict() {
    Equipo boca = new Equipo("Boca Juniors", "BOC");
    Equipo bocaa = new Equipo("Boca Juniors", "BOC");
    IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
    IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);
    IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);

    boca.agregar(jugadorBoca6);
    boca.agregar(jugadorBoca10);
    boca.agregar(jugadorBoca19);

    TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);
    TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);

    Partido partido = new Partido(new Estadio("La Bombonera", "Buenos Aires", "Argentina"), boca, bocaa, "Semifinal Partido Vuelta");

    partido.agregar(tarjetaRojaParaJugador6DeBoca);
    partido.agregar(tarjetaAmarillaParaJugador10DeBoca);

    Var elVar = new Var(partido);

    List<IJugador> jugadoresConTarjetaAmarilla = elVar.jugadoresConTarjetaAmarilla();

    // Verifica que los jugadores con tarjeta amarilla son los esperados
    assertEquals(1, jugadoresConTarjetaAmarilla.size()); // Debería haber 1 jugador con tarjeta amarilla
    assertTrue(jugadoresConTarjetaAmarilla.contains(jugadorBoca10));
    assertFalse(jugadoresConTarjetaAmarilla.contains(jugadorBoca6)); // JugadorBoca6 tiene tarjeta roja, no amarilla
    assertFalse(jugadoresConTarjetaAmarilla.contains(jugadorBoca19)); // JugadorBoca19 no tiene tarjetas
}
  */

}