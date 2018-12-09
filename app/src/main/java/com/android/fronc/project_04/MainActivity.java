package com.android.fronc.project_04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFramelayoutActivity(View view) {
        intent = new Intent(this, FramelayoutActivity.class);
        startActivity(intent);
    }

    public void goToLinearlayoutActivity(View view) {
        intent = new Intent(this, LinearlayoutActivity.class);
        startActivity(intent);
    }

    public void goToTablelayoutActivity(View view) {
        intent = new Intent(this, TablelayoutActivity.class);
        startActivity(intent);
    }

    public void goToGridlayoutActivity(View view) {
        intent = new Intent(this, GridlayoutActivity.class);
        startActivity(intent);
    }

    public void goToRelativelayoutActivity(View view) {
        intent = new Intent(this, RelativelayoutActivity.class);
        startActivity(intent);
    }
}
