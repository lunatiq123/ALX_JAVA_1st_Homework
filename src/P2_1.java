import javax.swing.JOptionPane;

public class P2_1

{
    public static void main(String[] args) {

        String ziemniaki = JOptionPane.showInputDialog("Ile kosztuje kilo ziemniaków? [zł]");
        int cena = Integer.parseInt(ziemniaki);

        String ilosc = JOptionPane.showInputDialog("Ile kilo ziemniaków mam zważyć?");
        int waga = Integer.parseInt(ilosc);

        int koszt = cena * waga;

        JOptionPane.showMessageDialog(null, "Należy się " + koszt + " zł");

    }

}


// Napisz program, który prosi użytkownika (przez JOptionPane.showInputDialog),
// żeby podał, ile
// kosztuje kilo ziemniaków. Niech program policzy i wyświetli, ile trzeba
// będzie zapłacić za pięć
// kilo ziemniaków.


