package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public TextField txtr_blachy, txtwys_walca, txtgrubosc_blachy, txtblacha_nierdzewna, txtblacha_stalowa;
    double r_walca, wys_walca, gr_blachy, ppow_walca, obj_blachy, waga_blachy_zwyk, waga_blachy_nierdzew, cena_blachy, cena_blachy_nierdzew;

    public void onBtnAction(ActionEvent actionEvent) {
        r_walca = Double.parseDouble(txtr_blachy.getText());                    //pobieranie danych//
        wys_walca = Double.parseDouble(txtwys_walca.getText());
        gr_blachy = Double.parseDouble(txtgrubosc_blachy.getText());

        ppow_walca = 2*Math.PI*Math.sqrt(r_walca)+2*Math.PI*r_walca*wys_walca; //Pole pow walca "P=2πR2+2πRh //
        obj_blachy = ppow_walca * gr_blachy;                                   //Obj_blachy = pole pow * grubosc blachy//
        waga_blachy_zwyk = Math.round(obj_blachy * 7.70/1000);                                  //w kilogramach
        waga_blachy_nierdzew = Math.round(obj_blachy * 7.86/1000);                             // w kilogramach
        cena_blachy = Math.round(waga_blachy_zwyk*2.9);
        cena_blachy_nierdzew = Math.round(waga_blachy_nierdzew*11.5);

        String cena_blachy_s=String.valueOf(cena_blachy);
        String waga_blachy_s=String.valueOf(waga_blachy_zwyk);
        String cena_blachy_nr_s=String.valueOf(cena_blachy_nierdzew);
        String waga_blachy_nr_s=String.valueOf(waga_blachy_nierdzew);

        txtblacha_stalowa.setText(cena_blachy_s + "zl" +" "+ waga_blachy_s + "kg");
        txtblacha_nierdzewna.setText(cena_blachy_nr_s + "zl" +" "+ waga_blachy_nr_s + "kg");

        //waga_blachy = obj_blachy * gestosc_blachy//
        System.out.println(waga_blachy_s +"kg "+ cena_blachy_s + "zl");


        // pole pow * grubosc blachy = objetosc

        //waga_blachy = objetosc_blachy * gestosc_blachy //

        //Gęstosci stali:
        //Stal	7500–7900 = ok 7700kg/m3 = 7,70g/cm3
        //Stal nierdzewna 7860kg/m3      = 7.86g/cm3





    }


}
