package sg.edu.np.mad.madpractical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button group1 = findViewById(R.id.group1);
        Button group2 = findViewById(R.id.group2);
        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        frameLayout.setForeground(@android:drawable/sym_def_app_icon);
    }
}