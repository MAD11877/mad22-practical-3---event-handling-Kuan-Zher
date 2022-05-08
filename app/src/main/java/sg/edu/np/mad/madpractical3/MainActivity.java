package sg.edu.np.mad.madpractical3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    User user1 = new User("Kuan Zher","Hello",1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Receiving Intent from ListActivity to display num
        Intent RandomInteger = getIntent();
        String RandomInt = RandomInteger.getStringExtra("Random");
        user1.name += " " + RandomInt;

        //Setting User Object parameters
        TextView nameTextView = findViewById(R.id.textView);
        nameTextView.setText(user1.name);
        TextView descriptionTextView = findViewById(R.id.textView2);
        descriptionTextView.setText(user1.description);


        //Creating Button OnClick Events
        Button followButton = findViewById(R.id.followButton);

        followButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (user1.followed)
                {
                    followButton.setText("Follow");
                    user1.followed = false;
                    String follow = new Boolean(user1.followed).toString();
                    Toast.makeText(getApplicationContext(), "Unfollowed", 2).show();
                }
                else
                {
                    followButton.setText("Unfollow");
                    user1.followed = true;
                    String follow = new Boolean(user1.followed).toString();
                    Toast.makeText(getApplicationContext(), "Followed", 2).show();
                }
            }
        });

        Button messageButton = findViewById(R.id.messageButton);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent message = new Intent(MainActivity.this,MessageGroup.class);
                startActivity(message);
            }
        });
    }
}