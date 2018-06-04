package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private int runA=0,runB=0,wicketA=0,wicketB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        Button sixA = (Button)findViewById(R.id.sixA);
        Button fourA = (Button)findViewById(R.id.fourA);
        Button threeA = (Button)findViewById(R.id.threeA);
        Button twoA = (Button)findViewById(R.id.twoA);
        Button oneA = (Button)findViewById(R.id.oneA);
        Button outA = (Button)findViewById(R.id.outA);

        Button sixB = (Button)findViewById(R.id.sixB);
        Button fourB = (Button)findViewById(R.id.fourB);
        Button threeB = (Button)findViewById(R.id.threeB);
        Button twoB = (Button)findViewById(R.id.twoB);
        Button oneB = (Button)findViewById(R.id.oneB);
        Button outB = (Button)findViewById(R.id.outB);

        Button reset = (Button)findViewById(R.id.reset);

        sixA.setOnClickListener(this);
        fourA.setOnClickListener(this);
        threeA.setOnClickListener(this);
        twoA.setOnClickListener(this);
        oneA.setOnClickListener(this);
        outA.setOnClickListener(this);

        sixB.setOnClickListener(this);
        fourB.setOnClickListener(this);
        threeB.setOnClickListener(this);
        twoB.setOnClickListener(this);
        oneB.setOnClickListener(this);
        outB.setOnClickListener(this);

        reset.setOnClickListener(this);
        
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.sixA:
                runA+=6;
                displayrunA(runA);
                break;

            case R.id.fourA:
                runA+=4;
                displayrunA(runA);
                break;

            case R.id.threeA:
                runA+=3;
                displayrunA(runA);
                break;

            case R.id.twoA:
                runA+=2;
                displayrunA(runA);
                break;
            case R.id.oneA:
                runA+=1;
                displayrunA(runA);
                break;

            case R.id.outA:
                if(wicketA < 10)
                {
                    wicketA+=1;
                    displaywicketA(wicketA);}
                break;

            case R.id.sixB:
                runB+=6;
                displayrunB(runB);
                break;

            case R.id.fourB:
                runB+=4;
                displayrunB(runB);
                break;

            case R.id.threeB:
                runB+=3;
                displayrunB(runB);
                break;

            case R.id.twoB:
                runB+=2;
                displayrunB(runB);
                break;
            case R.id.oneB:
                runB+=1;
                displayrunB(runB);
                break;

            case R.id.outB:
                if(wicketB < 10){
                    wicketB+=1;
                    displaywicketB(wicketB);}
                break;


            case R.id.reset:
                runA = runB = wicketA = wicketB = 0;
                displayrunA(runA);
                displayrunB(runB);
                displaywicketA(wicketA);
                displaywicketB(wicketB);
                break;

        }




    }
    

    private void displayrunA(int r)
    {
        TextView runA = (TextView)findViewById(R.id.runA);
        runA.setText(String.valueOf(r));

    }
    
    private void displaywicketA(int w){
        TextView wicketA = (TextView)findViewById(R.id.wicketA);
        wicketA.setText(String.valueOf(w));
    }

    

    private void displayrunB(int r)
    {
        TextView runB = (TextView)findViewById(R.id.runB);
        runB.setText(String.valueOf(r));

    }

    private void displaywicketB(int w){
        TextView wicketB = (TextView)findViewById(R.id.wicketB);
        wicketB.setText(String.valueOf(w));
    }


}
