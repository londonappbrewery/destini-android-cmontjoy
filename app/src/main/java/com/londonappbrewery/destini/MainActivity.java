package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mAns1Button, mAns2Button;
    int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mAns1Button = (Button) findViewById(R.id.buttonTop);
        mAns2Button = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAns1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex <= 2) {
                    mIndex = 3;
                    mStoryTextView.setText(getString(R.string.T3_Story));
                    mAns1Button.setText(getString(R.string.T3_Ans1));
                    mAns2Button.setText(getString(R.string.T3_Ans2));
                } else {
                    mIndex = 6;
                    mStoryTextView.setText(getString(R.string.T6_End));
                    mAns1Button.setVisibility(View.INVISIBLE);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mAns1Button.setClickable(false);
                    mAns2Button.setClickable(false);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAns2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 1) {
                    mIndex = 2;
                    mStoryTextView.setText(getString(R.string.T2_Story));
                    mAns1Button.setText(getString(R.string.T2_Ans1));
                    mAns2Button.setText(getString(R.string.T2_Ans2));
                } else if (mIndex == 2) {
                    mIndex = 4;
                    mStoryTextView.setText(getString(R.string.T4_End));
                    mAns1Button.setVisibility(View.INVISIBLE);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mAns1Button.setClickable(false);
                    mAns2Button.setClickable(false);
                } else {
                    mIndex = 5;
                    mStoryTextView.setText(getString(R.string.T5_End));
                    mAns1Button.setVisibility(View.INVISIBLE);
                    mAns2Button.setVisibility(View.INVISIBLE);
                    mAns1Button.setClickable(false);
                    mAns2Button.setClickable(false);
                }
            }
        });

    }
}
