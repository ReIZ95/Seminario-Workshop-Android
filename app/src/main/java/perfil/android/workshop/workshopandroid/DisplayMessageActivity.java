package perfil.android.workshop.workshopandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String phone = intent.getStringExtra(MainActivity.EXTRA_PHONE);
        String address = intent.getStringExtra(MainActivity.EXTRA_ADDRESS);
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);

        // Capture the layout's TextView and set the string as its text
        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(name);
        TextView textViewPhone = findViewById(R.id.textViewPhone);
        textViewPhone.setText(phone);
        TextView textViewAddress = findViewById(R.id.textViewAddress);
        textViewAddress.setText(address);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        textViewEmail.setText(email);

    }
}
