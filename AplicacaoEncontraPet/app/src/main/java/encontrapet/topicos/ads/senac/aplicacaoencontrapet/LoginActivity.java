package encontrapet.topicos.ads.senac.aplicacaoencontrapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by renat on 28/06/2017.
 */

public class LoginActivity  extends AppCompatActivity {

    private TextView tfEmail;
    private TextView tfSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tfEmail = (TextView)findViewById(R.id.tfEmail);
        tfSenha = (TextView)findViewById(R.id.tfSenha);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
