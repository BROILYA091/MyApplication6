

package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PortIncome rentIncome = new PortIncome(1, "Аренда площадей порта", 170000);
        ShipService serviceIncome = new ShipService(2, "Обслуживание морских судов", 125, 3500);

        int totalIncome = rentIncome.calculateIncome() + serviceIncome.calculateIncome();

        TextView textView = findViewById(R.id.textView2);
        textView.setText("Выручка морского порта за месяц: " + totalIncome + " монет");
    }
}