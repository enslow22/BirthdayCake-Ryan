package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cView;
    private CakeModel cModel;

    public CakeController(CakeView view){
        cView = view;
        cModel = cView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("button","BlowOut");
        cModel.lit = false;
        cView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("Switch", "Candles");
        cModel.candles = b;
        cView.invalidate();
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        Log.d("Seekbar","Seekbar num Candles");
        cModel.numCandles = i;
        cView.invalidate();
    }


    //Do not need these two actions for this project. Will leave them blank, but they are redundant.
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
