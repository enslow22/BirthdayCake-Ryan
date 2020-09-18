package cs301.birthdaycake;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


        CakeView view = findViewById(R.id.cakeview);


        CakeController listener = new CakeController(view);

        Button BlowOut = findViewById(R.id.blowout);
        BlowOut.setOnClickListener(listener);

        CompoundButton Candles = findViewById(R.id.switchCandles);
        Candles.setOnCheckedChangeListener(listener);

        SeekBar numCandles = findViewById(R.id.numCandles);
        numCandles.setOnSeekBarChangeListener(listener);

        view.setOnTouchListener(listener);




    }

    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }
}
