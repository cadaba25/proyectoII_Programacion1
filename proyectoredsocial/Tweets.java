/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoredsocial;

import java.util.Date;
import static proyectoredsocial.Date.DATEe;
/**
 *
 * @author ernes
 */
public class Tweets {
    
    public static Tweets tweets[]=new Tweets[300];
    String username, tweet;
    Date fecha=new Date();
    
    public Tweets(){
    } 
    
    public Tweets(String username, String tweet, Date fecha){
        this.username=username;
        this.tweet=tweet;
        this.fecha=fecha;
    }

    public Tweets[] getTweets() {
        return tweets;
    }
    
    public boolean publicar(String username, String tweet, Date fecha){
        username=Users.getUsuariologgeado();
        for (int i = tweets.length-1; i >= 0; i--) {
            if(tweets[i]==null){
                tweets[i]=new Tweets(username, tweet, fecha);
                return true;
            }
        }
        return false;
    }
    
    public String stringtweets() {
    String twit= username + ": " + tweet + " (" + fecha + ")";
    return twit;
    }
    
    public static String[] obtenerTweetsFiltrados(String[] seguidos, String usuarioLoggeado) {
        int contador = 0;
    
        for (Tweets t : tweets) {
            if (t != null && (t.username.equals(usuarioLoggeado) || contiene(seguidos, t.username))) {
                Users u = Users.buscarUsuario(t.username);
                if (u != null && u.estado) { 
                    contador++;
                }
            }
        }

        String[] tweetsFiltrados = new String[contador];
        int indice = 0;

        for (Tweets t : tweets) {
            if (t != null && (t.username.equals(usuarioLoggeado) || contiene(seguidos, t.username))) {
                Users u = Users.buscarUsuario(t.username);
                if (u != null && u.estado) { 
                    tweetsFiltrados[indice++] = t.stringtweets();
                }
            }
        }

        return tweetsFiltrados;
    }
    
    public static Tweets[] obtenerTweetsDeUnUsuario(String username) {
        int contador = 0;
    
        for(Tweets t : tweets){
            if(t != null && t.username.equals(username)){
                contador++;
            }
        }
        
        Tweets[] tweetFiltrados= new Tweets[contador];
        int indice = 0;
        
        for(Tweets t: tweets){
            if(t != null && t.username.equals(username)){
                tweetFiltrados[indice++] = t;
            }
        }
        
        
        return tweetFiltrados;

    }
    
    

    private static boolean contiene(String[] seguidos, String username) {
        for (String seguido : seguidos) {
            if (seguido != null && seguido.equals(username)) {
                return true;
            }
        }
        return false;
    }
    
    public static String[] obtenerHashtag(String hashtagbuscado){
        int contador=0;
        String[] tweetsHashtag=new String[100];
        for(Tweets t:tweets){
            if(t!=null && t.stringtweets().contains("#"+hashtagbuscado)){
                tweetsHashtag[contador++]=t.stringtweets();
            }
        }
        return tweetsHashtag;
    }

    public static String[] obtenerMenciones(){
        int contador=0;
        String usuario=Users.getUsuariologgeado();
        String[] tweetsMencion=new String[100];
        for(Tweets t: tweets){
            if(t!=null && t.tweet.contains("@"+usuario)){
                tweetsMencion[contador++]=t.stringtweets();
            }
        }
        return tweetsMencion;
    }
}

       

