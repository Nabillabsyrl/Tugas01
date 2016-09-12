package id.sch.smktelkom_mlg.tugas01.xirpl3023.tugas01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    EditText etNama, etSewa, etFasT;
    RadioButton rbS, rbD, rbSS;
    TextView tvHasil;
    CheckBox cbI, cbTV, cbAC;
    Spinner spKode;
    Button bOK;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etSewa = (EditText) findViewById(R.id.editTextSewa);
        etFasT = (EditText) findViewById(R.id.editTextFT);
        rbS = (RadioButton) findViewById(R.id.radioButton1);
        rbD = (RadioButton) findViewById(R.id.radioButton2);
        rbSS = (RadioButton) findViewById(R.id.radioButton3);
        cbI = (CheckBox) findViewById(R.id.checkBox1);
        cbTV = (CheckBox) findViewById(R.id.checkBox1);
        cbAC = (CheckBox) findViewById(R.id.checkBox1);
        spKode = (Spinner) findViewById(R.id.spinnerKode);
        bOK = (Button) findViewById(R.id.buttonOK);

        etSewa.setText("Rp.500.000");
        tvHasil = (TextView) findViewById(R.id.textViewHasil);



        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doClick();
            }

        });}






