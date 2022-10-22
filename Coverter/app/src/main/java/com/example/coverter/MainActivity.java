package com.example.coverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton btnRadioFromKm;
    private RadioButton btnRadioFromMiles;
    private EditText txtValue;
    private  EditText txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRadioFromKm = (RadioButton) findViewById(R.id.rbFromKM);
        btnRadioFromMiles = (RadioButton) findViewById(R.id.rbFromMiles);
        txtValue = (EditText) findViewById(R.id.txtValue);
        txtResult = (EditText) findViewById(R.id.txtResult);
    }

    public  void handleClick(View view)
    {
switch (view.getId())
{
    case R.id.btnConvert:
        String result;
        String value = txtValue.getText().toString();
        if(btnRadioFromMiles.isChecked())
        {
            result = MilestoKM(value);
        }
        else
        {
            result = KmToMiles(value);
        }
        txtResult.setText((result));
        break;
    case R.id.btnReset:
        btnRadioFromKm.setChecked((true));
        btnRadioFromMiles.setChecked((false));
        txtValue.setText(" ");
        txtResult.setText(" ");
}
    }
    private String MilestoKM(String Miles)
    {
        double mvalue = Double.parseDouble((Miles));
        double kmvalue = mvalue * 1.609;
        return  String.valueOf(kmvalue);
    }
    private  String KmToMiles(String KM)
    {
        double kmvalue =Double.parseDouble((KM));
        double mvalue = kmvalue/1.609;
        return  String.valueOf(mvalue);
    }
}