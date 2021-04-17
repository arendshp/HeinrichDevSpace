package arends.com.passedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMe extends AppCompatActivity {

    Button backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        backBtn = findViewById(R.id.backButton_2);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent receiveIntent = getIntent();

                Intent menuPage = new Intent(AboutMe.this, MenuActivity.class);
                startActivity(menuPage);
            }
        });
    }
}