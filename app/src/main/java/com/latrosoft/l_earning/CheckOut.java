package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class CheckOut extends AppCompatActivity implements PaymentResultListener {
    private TextView title,price,offer,total;
    private  long finalprice;
    private String id,link,checkouttitle,checkoutprice,original;
    private ImageView thumbnail;
    private Button checkoutBuy;
    private Checkout checkout;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        checkout = new Checkout();
        checkoutBuy = findViewById(R.id.checkout_buy);
        checkout.setKeyID("rzp_test_xRtcjLd7vZzA5G");
        intent=getIntent();

        id=intent.getExtras().getString("id");
        checkouttitle= intent.getStringExtra("title");
        link= intent.getStringExtra("link");
        checkoutprice= intent.getExtras().getString("price");
        original=intent.getExtras().getString("original");;


        thumbnail = findViewById(R.id.chech_out_image);
        title=findViewById(R.id.checkout_title);
        price=findViewById(R.id.checkout_price);
        offer=findViewById(R.id.checkout_offer_price);
        finalprice = Integer.parseInt(checkoutprice.toString()) *100;
        Glide.with(this).load(link).into(thumbnail);
        title.setText(checkouttitle);
        price.setText(checkoutprice);
        offer.setText(original);
        checkoutBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPayment();
            }
        });


    }
    void startPayment(){
        try {
            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount",finalprice); // amount in the smallest currency unit
            orderRequest.put("currency", "INR");
            orderRequest.put("receipt", id);
           // Order order = razorpay.Orders.create(orderRequest);
            checkout.open(this,orderRequest);
        } catch (Exception e) {
            // Handle Exception
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this,"Payment Successfull",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this,"Payment Faild",Toast.LENGTH_LONG).show();
    }
}