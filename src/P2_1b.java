
import javax.swing.JOptionPane;

public class P2_1b {


    public static void main(String[] args) {
        /*
         * napisz program, który prosi użytkownika (przez JOptionPane.showInputDialog),
         * żeby podał, ile kosztuje kilo ziemniaków, ile kilo ziemniaków chce kupić, ile
         * kosztuje kilo bananów i ile kilo bananów chce kupić. Niech program policzy i
         * wyświetli, ile trzeba będzie zapłacić za te ziemniaki i banany razem. I niech
         * program sprawdzi i powie, za co trzeba będzie zapłacić więcej - za banany czy
         * za ziemniaki. W pierwszej wersji zrealizuj zadanie używając liczb typu
         * double.
         */

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
		/*
		//Opcja dla chętnych - na później, tylko dla ostatniej wersji: użyj liczb typu BigDecimal
		//i zaokrąglaj kwoty do dwóch miejsc po przecinku.


		BigDecimal a = new BigDecimal("10.12345");
		BigDecimal b = new BigDecimal("10.12556");

		a = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		System.out.println(a);
		System.out.println(b);

		*/

    }

}
