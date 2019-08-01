package com.dk.dk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CardView extends AppCompatActivity {

    LinearLayout lnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);



    }
    public void Postlist (View view)
    {
        Intent intent = new Intent(CardView.this,PostListActivity.class);
        startActivity(intent);
    }
    public void Maps (View view)
    {
        Intent intent = new Intent(CardView.this,Maps3.class);
        startActivity(intent);
    }
    public void Resep (View view)
    {
        Intent intent = new Intent(CardView.this,MainActivity.class);
        startActivity(intent);
    }
}
