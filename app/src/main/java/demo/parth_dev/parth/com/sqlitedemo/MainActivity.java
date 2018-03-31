package demo.parth_dev.parth.com.sqlitedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import demo.parth_dev.parth.com.sqlitedemo.sqlitelib.DataHelper;

public class MainActivity extends AppCompatActivity {


    EditText name, number, email, address;
    Button insert;

    String namedata, numberdata, emaildata, addressdata;
    DataHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DataHelper(MainActivity.this);

        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        insert = (Button) findViewById(R.id.insert);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                namedata = name.getText().toString();
                numberdata = number.getText().toString();
                emaildata = email.getText().toString();
                addressdata = address.getText().toString();

                boolean b = helper.insertdata(namedata, numberdata, emaildata, addressdata);

                if (b)
                    Toast.makeText(MainActivity.this, "Data Inserted Successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Data not Inserted ",Toast.LENGTH_LONG).show();


            }
        });


    }
   
}
