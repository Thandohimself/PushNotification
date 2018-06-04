package net.simplifiedcoding.firebasecloudmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReallocateDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reallocate_driver);
        String s = getIntent().getStringExtra("EXTRA_SESSION_ID");
    }
}
