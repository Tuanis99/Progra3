package progra3;
import UI.menu;
import LinearStructures.PokeLinkedList;
import javax.swing.*;
public class prograTres {

    public static PokeLinkedList pokeList = new PokeLinkedList();
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello there! Welcome to the world of pokémon! My name is Oak! People call me the pokémon Prof! This world is inhabited by creatures called pokémon! For some people, pokémon are pets. Others use them for fights. Myself...I study pokémon as a profession.", "Welcome Ranger",JOptionPane.PLAIN_MESSAGE);
        maps mapa = new maps();
        menu initialmenu = new menu ();
        initialmenu.setVisible(true);
        initialmenu.setLocationRelativeTo(null);
        initialmenu.setDefaultCloseOperation(initialmenu.HIDE_ON_CLOSE);
    }
    
}
