package prueba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import twitter4j.TwitterException;
import static org.junit.Assert.assertEquals;

public class MainActividadPrueba {
    ConexionTwitter  conexion;

    @Before
    public void Setup() {
        conexion = new ConexionTwitter();
    }

    @Test
    public void PruebaBusquedaUsuario() throws TwitterException {
      String usuario;
      try{
        usuario = conexion.buscarUsuario("AdustielCrow");
        assertEquals(usuario,"AdustielCrow");
      }
      catch(Exception e){
        //Se determino que el usuario no existe con exito
        System.out.println("No se consiguio el usuario");
      }
    }

    @After
    public void tearDown(){
        conexion = null;
    }
}
