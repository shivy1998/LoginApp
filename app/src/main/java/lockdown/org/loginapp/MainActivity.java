package lockdown.org.loginapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tvId, tvPassword;
    EditText etId, etPassword;
    Button btnSubmit, btnCancel;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        tvId = findViewById(R.id.tvId);
        tvPassword = findViewById(R.id.tvPassword);
        etId = findViewById(R.id.etId);
        etPassword = findViewById(R.id.etPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);
        btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String loginid = etId.getText().toString();
                String password = etPassword.getText().toString();
                if(loginid.length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter your Login Id"+loginid, Toast.LENGTH_LONG).show();
                }
                else if (password.length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter your Password"+password, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Sucessful", Toast.LENGTH_LONG).show();
                }

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                etId.setText("");
                etPassword.setText("");
            }
        });

    }
}
