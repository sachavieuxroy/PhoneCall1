package google.android.com.phonecall1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123"));
        startActivity(call);
    }
}
