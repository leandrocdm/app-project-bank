package bank.com.br.app_project_bank;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtLogin;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLogin = findViewById(R.id.edtLogin);
        edtPass = findViewById(R.id.edtPass);
    }

    public void logar(View view) {

        if(edtLogin.getText().toString().equals("admin") && edtPass.getText().toString().equals("admin")){
            Intent it = new Intent();
        }else {
            Toast.makeText(this, "Senha incorreta!", Toast.LENGTH_SHORT).show();
        }

    }
}
