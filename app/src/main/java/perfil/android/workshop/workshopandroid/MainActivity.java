package perfil.android.workshop.workshopandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Spinner;
import java.util.LinkedList;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.myfirstapp.NAME";
    public static final String EXTRA_PHONE = "com.example.myfirstapp.PHONE";
    public static final String EXTRA_ADDRESS = "com.example.myfirstapp.ADDRESS";
    public static final String EXTRA_EMAIL = "com.example.myfirstapp.EMAIL";
    public static final String EXTRA_IMAGE = "com.example.myfirstapp.IMAGE";
    LinkedList<String> companies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /** Called when the user taps the Send button */
    public void saveResults(View view) {
        // Necessário fazer o import à unha da View

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        // Get editText
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextAddress = findViewById(R.id.editTextAddress);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        // Get selected company
        Spinner spinner = findViewById(R.id.spinner);
        String selectedCompany = (String) spinner.getSelectedItem();

        // Get dados
        String name = editTextName.getText().toString();
        String phone = editTextPhone.getText().toString();
        String address = editTextAddress.getText().toString();
        String email = editTextEmail.getText().toString();
        String companyName = "";

        switch(selectedCompany) {
            case "Worten":
                companyName = "worten";
                break;
            case "Vodafone":
                companyName = "vodafone";
                break;
            case "Fnac":
                companyName = "fnac";
                break;
            case "Continente":
                companyName = "continente";
                break;
        }

        // Send to Intent, cannot send an Object :)
        intent.putExtra(EXTRA_NAME, name).putExtra(EXTRA_PHONE, phone)
                .putExtra(EXTRA_ADDRESS, address).putExtra(EXTRA_EMAIL, email)
                .putExtra(EXTRA_IMAGE, companyName);
        startActivity(intent);

    }


    public void populateSpinner(View view) {
        Spinner spinner = findViewById(R.id.spinner);


        this.companies = new LinkedList<>();
        companies.add("WORTEN");
        companies.add("VODAFONE");
        companies.add("FNAC");
        companies.add("CONTINENTE");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, companies);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }




}
