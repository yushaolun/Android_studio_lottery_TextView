package com.example.lottery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    public TextView []g1=new TextView[6];
    public int[] g1n={R.id.num0,R.id.num1,R.id.num2,R.id.num3,R.id.num4,R.id.num5}; //把id位置放進去g1n陣列

    public TextView []g2=new TextView[6];
    public int[] g2n={R.id.num6,R.id.num7,R.id.num8,R.id.num9,R.id.num10,R.id.num11};

    public TextView []g3=new TextView[6];
    public int[] g3n={R.id.num12,R.id.num13,R.id.num14,R.id.num15,R.id.num16,R.id.num17};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;g1.length>i;i++){
            g1[i]=findViewById(g1n[i]); // get到id位置
            g2[i]=findViewById(g2n[i]);
            g3[i]=findViewById(g3n[i]);
        }




    }

    public void lottery(View view) {
         int[] num1=createnum();
         for (int i=0;num1.length>i;i++){
              g1[i].setText(String.valueOf(num1[i])); //setText
         }
         int[] num2=createnum();
         for (int i=0;num2.length>i;i++){
             g2[i].setText(String.valueOf(num2[i]));
         }
        int[] num3=createnum();
        for (int i=0;num3.length>i;i++){
            g3[i].setText(String.valueOf(num3[i]));
        }

    }



    public int[] createnum(){
        HashSet<Integer>set=new HashSet<>();
        int random;
        while (set.size()<6){

            set.add((int)(Math.random()*49+1));
        }
        int i=0;
        int[]lottery=new int[6];
        for (Integer num:set ){
            lottery[i]=num;
            i++;
        }
      return lottery;
    }


}
