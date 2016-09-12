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


    }

}


