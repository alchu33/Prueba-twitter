package prueba;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public  class ConexionTwitter {

    //Este metodo conecta el programa con la aplicacion de twitter creada
    public Twitter conectarTwitter () throws TwitterException {
        ConfigurationBuilder configBuilder = new ConfigurationBuilder();
        configBuilder.setDebugEnabled(true).setOAuthConsumerKey("CLNMDibnm9Y6GN3IuLioSLkoT")
                .setOAuthConsumerSecret("XWyvB8pXGoFmiuUuu0pBsQvsmNKE8xfefvmu4sgFIsgd8wrDWi")
                .setOAuthAccessToken("146905756-BZKRKManKACRLUKoBv6XtR9TMcn81iaOkMz5YcMe")
                .setOAuthAccessTokenSecret("NtASIIZUJ7xYdHEuzM0ofA88lLEJBWqgkaRqqyE3Cq17O");
                //Estos parametros son las credenciales de la aplicacion creada
        TwitterFactory tf = new TwitterFactory(configBuilder.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

    //Este metodo se encarga de buscar un usuario segun el nombre de usuario que se le pasa
    public String buscarUsuario(String nombre) throws TwitterException {
      String screenName;
      Twitter twitter = this.conectarTwitter();
        try {
            screenName = twitter.showUser(nombre).getScreenName();
            //ScreenName corresponde al nombre del usuario sin el @
            System.out.println(twitter.showUser(screenName));
        }
        catch (TwitterException e) {
            return "El usuario que busca no existe";
        }
        return screenName;
    }
}
