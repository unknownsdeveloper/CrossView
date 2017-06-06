package ankit.developer.unknowns.crossview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cdflynn.android.library.crossview.CrossView;

public class MainActivity extends AppCompatActivity {
    private CrossView mCrossView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrossView = (CrossView) findViewById(R.id.sample_cross_view);
        mCrossView.setOnClickListener(mCrossViewClickListener);
        mCrossView.setColor(getResources().getColor(R.color.cross_view_stroke_color));
    }
    private final View.OnClickListener mCrossViewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mCrossView.toggle();
        }
    };
}
