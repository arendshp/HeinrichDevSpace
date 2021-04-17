package arends.com.passedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView tv;
    String st;
    Button homeBtn;
    Button calcBtn;
    Button aboutBtn;
    Button profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tv = findViewById(R.id.valueText);
        homeBtn = findViewById(R.id.homeButton);
        calcBtn = findViewById(R.id.calculationButton);
        aboutBtn = findViewById(R.id.aboutMeButton);
        profileBtn = findViewById(R.id.myDevProfileeButton);

        st = getIntent().getExtras().getString("Value");
        tv.setText(st);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePage = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(homePage);
            }
        });

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculationPage = new Intent(MenuActivity.this, Calculation.class);
                startActivity(calculationPage);
            }
        });

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutPage = new Intent(MenuActivity.this, AboutMe.class);
                startActivity(aboutPage);
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilePage = new Intent(MenuActivity.this, MyDevProfile.class);
                startActivity(profilePage);
            }
        });
    }
}