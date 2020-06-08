package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView   mStoryTextView;
    Button  mTopButton;
    Button mBottomButton;
    int level = 1;
    String pathName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level == 1){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    pathName = "pathOne";
                }
                if (level == 2 && pathName.equals("pathOne")){
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }
                if (level == 2 && pathName.equals("pathTwo")){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                }
                if (level == 3){
                    mStoryTextView.setText(R.string.T6_End);
                }
                level += 1;
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (level == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    pathName = "pathTwo";
                }
                if (level == 2 && pathName.equals("pathTwo")){
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }
                if (level == 2 && pathName.equals("pathOne")){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }

                if (level == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);
                }
                level += 1;
            }
        });


    }
}
