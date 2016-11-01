package com.example.cait.lagrand_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class potatohead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatohead);

        // Add image on check
        addListenerOnCheck();
    }

    public void addListenerOnCheck() {

        // Checkboxes
        CheckBox hatbox = (CheckBox) findViewById(R.id.hatbox);
        CheckBox eyesbox = (CheckBox) findViewById(R.id.eyesbox);
        CheckBox earsbox = (CheckBox) findViewById(R.id.earsbox);
        CheckBox nosebox = (CheckBox) findViewById(R.id.nosebox);
        CheckBox mouthbox = (CheckBox) findViewById(R.id.mouthbox);
        CheckBox glassesbox = (CheckBox) findViewById(R.id.glassesbox);
        CheckBox eyebrowsbox = (CheckBox) findViewById(R.id.eyebrowsbox);
        CheckBox mustachebox = (CheckBox) findViewById(R.id.mustachebox);
        CheckBox armsbox = (CheckBox) findViewById(R.id.armsbox);
        CheckBox shoesbox = (CheckBox) findViewById(R.id.shoesbox);

        hatbox.setOnClickListener(checkboxClickListener);
        eyesbox.setOnClickListener(checkboxClickListener);
        earsbox.setOnClickListener(checkboxClickListener);
        nosebox.setOnClickListener(checkboxClickListener);
        mouthbox.setOnClickListener(checkboxClickListener);
        glassesbox.setOnClickListener(checkboxClickListener);
        eyebrowsbox.setOnClickListener(checkboxClickListener);
        mustachebox.setOnClickListener(checkboxClickListener);
        armsbox.setOnClickListener(checkboxClickListener);
        shoesbox.setOnClickListener(checkboxClickListener);
    }

    View.OnClickListener checkboxClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO: kan dit mooier zonder switch, maar met die <var>box ??
            ImageView image = (ImageView) findViewById(R.id.bodyImage);
            switch (v.getId()) {
                case R.id.hatbox:
                    image = (ImageView) findViewById(R.id.hatImage);
                    break;
                case R.id.eyesbox:
                    image = (ImageView) findViewById(R.id.eyesImage);
                    break;
                case R.id.earsbox:
                    image = (ImageView) findViewById(R.id.earsImage);
                    break;
                case R.id.nosebox:
                    image = (ImageView) findViewById(R.id.noseImage);
                    break;
                case R.id.mouthbox:
                    image = (ImageView) findViewById(R.id.mouthImage);
                    break;
                case R.id.glassesbox:
                    image = (ImageView) findViewById(R.id.glassesImage);
                    break;
                case R.id.eyebrowsbox:
                    image = (ImageView) findViewById(R.id.eyebrowsImage);
                    break;
                case R.id.mustachebox:
                    image = (ImageView) findViewById(R.id.mustacheImage);
                    break;
                case R.id.armsbox:
                    image = (ImageView) findViewById(R.id.armsImage);
                    break;
                case R.id.shoesbox:
                    image = (ImageView) findViewById(R.id.shoesImage);
                    break;
            }
            if (((CheckBox) v).isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }

        }
    };
}
