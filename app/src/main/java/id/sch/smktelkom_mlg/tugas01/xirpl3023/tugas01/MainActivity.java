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


public class MainActivity extends AppCompatActivity
{
    EditText etNama, etSewa;
    RadioButton rbM, rbBM;
    TextView tvHasil;
    CheckBox cbI, cbTV, cbAC;
    Spinner spKode;
    Button bOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etSewa = (EditText) findViewById(R.id.editTextSewa);
        rbM = (RadioButton) findViewById(R.id.radioButton1);
        rbBM = (RadioButton) findViewById(R.id.radioButton2);
        cbI = (CheckBox) findViewById(R.id.checkBox1);
        cbTV = (CheckBox) findViewById(R.id.checkBox2);
        cbAC = (CheckBox) findViewById(R.id.checkBox3);
        spKode = (Spinner) findViewById(R.id.spinnerKode);
        bOK = (Button) findViewById(R.id.buttonOK);


        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doClick();
            }

        });}



    private void doClick() {
            if (isValid()){
            String nama = etNama.getText().toString();
                String hasil = null;
                if(rbM.isChecked())
                {
                    hasil = rbM.getText().toString();
                }
                else if(rbBM.isChecked())
                {
                    hasil = rbBM.getText().toString();
                }

                if(hasil == null)
                {
                    tvHasil.setText("Belum Memilih Status" +hasil);
                }else {
                }
                String fas="Fasilitas Tambahan:\n";
                int startlen = fas.length();
                if(cbI.isChecked()) fas+=cbI.getText()+"\n";
                if(cbTV.isChecked()) fas+=cbTV.getText()+"\n";
                if(cbAC.isChecked()) fas+=cbAC.getText()+"\n";

                if(fas.length()==startlen) fas+="Tidak ada pilihan";
                tvHasil.setText("Fasilitas anda : "+fas);
        }
    }

    private boolean isValid() {
        String nama=etNama.getText().toString();
        boolean valid = true;

        if (nama.isEmpty()){
            etNama.setError("Nama Belum Diisi");
            valid = false;
        }
        else{
            etNama.setError(null);
        }
        return valid;
    }
}



