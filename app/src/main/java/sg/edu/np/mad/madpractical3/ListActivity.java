package sg.edu.np.mad.madpractical3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final String TAG = "List Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView myAndroidButton = findViewById(R.id.androidButton);
        myAndroidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(ListActivity.this);
                alert.setTitle("Profile");
                alert.setMessage("MADness");
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.v(TAG, "Closed" + id);
                    }
                });
                alert.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Random random = new Random();
                        int randomInt = random.nextInt(999999999);
                        Log.v(TAG, String.valueOf(randomInt));
                        Intent randomInteger = new Intent(ListActivity.this,MainActivity.class);
                        randomInteger.putExtra("Random", String.valueOf(randomInt));
                        startActivity(randomInteger);

                        Log.v(TAG, "Viewed" + randomInt);
                    }
                });
                alert.show();
            }
        });
    }
}