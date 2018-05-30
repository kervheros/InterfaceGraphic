package com.example.hp.interfacegrafic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewCasa extends AppCompatActivity
{
    private Context root;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_casa);
        root = this;
        loadComponents();
    }

    private void loadComponents()
    {
        Button btnMap = (Button)this.findViewById(R.id.btnUbic);
        Button btnUser = (Button)this.findViewById(R.id.btnProp);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(root, Maps.class);
                root.startActivity(map);
            }
        });
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user = new Intent(root, User.class);
                root.startActivity(user);
            }
        });
    }

}
