package arends.com.passedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyDevProfile extends AppCompatActivity {

    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile);

        backBtn = findViewById(R.id.btn_back_profile_menu);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent receiveIntent = getIntent();

                Intent menuPage = new Intent(MyDevProfile.this, MenuActivity.class);
                startActivity(menuPage);
            }
        });
    }
}