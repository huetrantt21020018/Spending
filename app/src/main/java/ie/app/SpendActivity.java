package ie.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SpendActivity extends AppCompatActivity {

    private Button spendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spendButton = (Button) findViewById(R.id.spendButton);
        if (spendButton != null)
        {
            Log.v("Spend!", "Really got the spend button");
        }

        setContentView(R.layout.activity_spend);
    }
}