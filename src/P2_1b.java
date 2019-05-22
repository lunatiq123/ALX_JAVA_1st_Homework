
import javax.swing.JOptionPane;

public class P2_1b {

    public static void main(String[] args) {

        String ziemniaki = JOptionPane.showInputDialog("Ile kosztuje kilo ziemniaków? [zł]");
        double ziemniakiCena = Integer.parseInt(ziemniaki);

        String ziemniaki2 = JOptionPane.showInputDialog("Ile kilo ziemniaków mam zważyć?");
        double ziemniakiIlosc = Integer.parseInt(ziemniaki2);

        String banany = JOptionPane.showInputDialog("Ile kosztuje kilo bananów? [zł]");
        double bananyCena = Integer.parseInt(banany);

        String banany2 = JOptionPane.showInputDialog("ile kilo bananów zważyć?");
        double bananyIlosc = Integer.parseInt(banany2);

        double kosztZiemniaki = ziemniakiCena * ziemniakiIlosc;

        double kosztBanany = bananyCena * bananyIlosc;

        double koszt = (kosztZiemniaki) + (kosztBanany);

        JOptionPane.showMessageDialog(null, "Należy się " + koszt + " zł");

        if ((kosztZiemniaki) > (kosztBanany)) {

            JOptionPane.showMessageDialog(null, "Droższe są ziemniaki i kosztują " + kosztZiemniaki + " zł");
        } else if ((kosztBanany) > (kosztZiemniaki)) {
            JOptionPane.showMessageDialog(null, "Droższe są banany i kosztują " + kosztBanany + " zł");
        } else {
            JOptionPane.showMessageDialog(null, "Ziemniaki i banany kosztują po " + kosztBanany + " zł");
        }
		    }
}
