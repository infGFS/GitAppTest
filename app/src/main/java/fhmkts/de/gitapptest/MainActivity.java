package fhmkts.de.gitapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bitte den Bool für euren Namen auf True setzen, wenn alles funktioniert hat
        boolean felix = true;
        boolean marco = false;
        boolean tim = false;
        boolean tester = false;

        //Deklarieren der TextViews in verschiedene Variablen (fh, mk, ts)
        TextView fh = (TextView) findViewById(R.id.fh);
        TextView mk = (TextView) findViewById(R.id.mk);
        TextView ts = (TextView) findViewById(R.id.ts);
        TextView tt = (TextView) findViewById(R.id.tt);

        //Überprüfung und setzen des Textes in den jeweiligen TextView
        if (felix == true) {
            fh.setText("Für Felix funktioniert GitHub!");
        } else if (marco == true) {
            mk.setText("Für Marco funktioniert GitHub!");
        } else if (tim == true) {
            ts.setText("Für Tim funktioniert GitHub!");
        } else if (tester == true) {
            tt.setText("Für Tester funktioniert GitHub!");

        }
    }
}
