package com.example.codetribe.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;





public class MainActivity extends AppCompatActivity {
        int Quantity = 2;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void decrement (View view){
        Quantity = Quantity - 1;
        display(Quantity);
        price = Quantity * 5;

    }
    public void increment (View view) {
        display(Quantity);
        Quantity =Quantity + 1;
        price = Quantity * 5;
    }
    public void submitOrder (View view){
        String priceMessage = "Total: " + price  ;
        priceMessage = priceMessage + " Thank you";
        displayMessage (priceMessage);

    }

    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_View);
        priceTextView.setText(message);

    }

    private void display(int number) {
        TextView quantityTextView =(TextView) findViewById(R.id.quality_text_view);
              quantityTextView.setText("" + number);
    }
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_View);
             priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }
}
   

