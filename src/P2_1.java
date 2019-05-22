import javax.swing.JOptionPane;

public class P2_1 {
    public static void main(String[] args) {
        String ziemniaki;
        String ilosc;
        int cena;
        int waga;
        int koszt;

        ziemniaki = JOptionPane.showInputDialog("Ile kosztuje kilo ziemniaków? [zł]");
        cena = Integer.parseInt(ziemniaki);

        ilosc = JOptionPane.showInputDialog("Ile kilo ziemniaków mam zważyć?");
        waga = Integer.parseInt(ilosc);

        koszt = cena * waga;

        JOptionPane.showMessageDialog(null, "Należy się " + koszt + " zł");
    }
}


