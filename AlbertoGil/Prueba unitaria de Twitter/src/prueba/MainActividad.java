package prueba;

import twitter4j.*;

import java.util.Scanner;

public class MainActividad {
    public static void main (String[] args) throws TwitterException {
      Scanner scanner = new Scanner(System.in);
      String nombredeusuario;                              //Guarda el nombre de usuario a buscar
      ConexionTwitter conexion = new ConexionTwitter();    //Se encarga de conectar a la aplicacion
      System.out.println("Introducir nombre de usuario, sin el arroba, a consultar: ");
      nombredeusuario = scanner.nextLine();
      try{
        conexion.buscarUsuario(nombredeusuario);
        System.out.println(nombredeusuario);
        //Busca el usuario y atrapa la excepcion que se genera en caso de que no exista
        //En caso contrario, imprime el nombre del usuario
      }
      catch (Exception e) {
          System.out.println("\nHa ocurrido un error\n");
      }
    }
}
