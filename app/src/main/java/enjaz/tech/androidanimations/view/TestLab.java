package enjaz.tech.androidanimations.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import enjaz.tech.androidanimations.R;
import enjaz.tech.androidanimations.core.Transitions;

public class TestLab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lab);
        setupWindowAnimations();
        setupLayout();
        setupToolbar();

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void setupWindowAnimations(){
        getWindow().setEnterTransition(Transitions.buildExplodeEnterTransition());
    }
    private void setupLayout() {
        findViewById(R.id.exit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });
    }

    void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

}
