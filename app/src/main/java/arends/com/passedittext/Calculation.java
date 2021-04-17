package arends.com.passedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculation extends AppCompatActivity {

    private Button backBtn;
    private EditText costEdit;
    private EditText itemsEdit;
    private TextView result;
    private Button calculate;
    private final static int METRICS = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        backBtn = findViewById(R.id.backButton);
        costEdit = findViewById(R.id.cost);
        itemsEdit = findViewById(R.id.items);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.calculatePoints);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent receiveIntent = getIntent();

                Intent menuPage = new Intent(Calculation.this, MenuActivity.class);
                startActivity(menuPage);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               double cost = Double.parseDouble(costEdit.getText().toString());
               int items = Integer.parseInt(itemsEdit.getText().toString());
               double sum = (double) (cost * items / METRICS);
               result.setText("Total Points: " + String.valueOf(sum));
            }
        });
    }
}