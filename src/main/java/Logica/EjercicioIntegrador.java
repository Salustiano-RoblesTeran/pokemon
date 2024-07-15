

package Logica;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.hidroBomba();
        
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        
        pikachu.atacarAraniazo();
        pikachu.impacTrueno();
        
        
    }
}
