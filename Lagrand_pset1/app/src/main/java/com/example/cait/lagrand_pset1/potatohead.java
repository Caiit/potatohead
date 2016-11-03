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
    }

    /***
     *
     * @param v
     *
     * Given the checkbox, set the corresponding image to visible (when box is checked)
     * or invisible (when box is unchecked)
     */
    public void showImage(View v) {
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
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    // Override save instances to save the states of the images after rotation
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        // Image visibility
        savedInstanceState.putInt("hat",(findViewById(R.id.hatImage)).getVisibility());
        savedInstanceState.putInt("eyes",(findViewById(R.id.eyesImage)).getVisibility());
        savedInstanceState.putInt("ears",(findViewById(R.id.earsImage)).getVisibility());
        savedInstanceState.putInt("nose",(findViewById(R.id.noseImage)).getVisibility());
        savedInstanceState.putInt("mouth",(findViewById(R.id.mouthImage)).getVisibility());
        savedInstanceState.putInt("glasses",(findViewById(R.id.glassesImage)).getVisibility());
        savedInstanceState.putInt("eyebrows",(findViewById(R.id.eyebrowsImage)).getVisibility());
        savedInstanceState.putInt("mustache",(findViewById(R.id.mustacheImage)).getVisibility());
        savedInstanceState.putInt("arms",(findViewById(R.id.armsImage)).getVisibility());
        savedInstanceState.putInt("shoes",(findViewById(R.id.shoesImage)).getVisibility());
        super.onSaveInstanceState(savedInstanceState);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        // Image visibility
        findViewById(R.id.hatImage).setVisibility(savedInstanceState.getInt("hat"));
        findViewById(R.id.eyesImage).setVisibility(savedInstanceState.getInt("eyes"));
        findViewById(R.id.earsImage).setVisibility(savedInstanceState.getInt("ears"));
        findViewById(R.id.noseImage).setVisibility(savedInstanceState.getInt("nose"));
        findViewById(R.id.mouthImage).setVisibility(savedInstanceState.getInt("mouth"));
        findViewById(R.id.glassesImage).setVisibility(savedInstanceState.getInt("glasses"));
        findViewById(R.id.eyebrowsImage).setVisibility(savedInstanceState.getInt("eyebrows"));
        findViewById(R.id.mustacheImage).setVisibility(savedInstanceState.getInt("mustache"));
        findViewById(R.id.armsImage).setVisibility(savedInstanceState.getInt("arms"));
        findViewById(R.id.shoesImage).setVisibility(savedInstanceState.getInt("shoes"));
    }

}
