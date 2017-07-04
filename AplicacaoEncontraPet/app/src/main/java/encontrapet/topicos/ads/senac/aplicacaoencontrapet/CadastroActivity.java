package encontrapet.topicos.ads.senac.aplicacaoencontrapet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by renat on 28/06/2017.
 */

public class CadastroActivity extends AppCompatActivity {

    private TextView tfNomeDono;
    private TextView tfEmail;
    private TextView tfEndereco;
    private TextView tfTelefone;
    private TextView tfNomePet;
    private TextView tfEspecie;
    private TextView tfRastreador;
    private Button btCadastrar;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("banco_encontraPet");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);



        tfNomeDono = (TextView) findViewById(R.id.tfNomeDono);
        tfEmail = (TextView) findViewById(R.id.tfEmail);
        tfEndereco = (TextView) findViewById(R.id.tfEndereco);
        tfTelefone = (TextView) findViewById(R.id.tfTelefone);
        tfNomePet = (TextView) findViewById(R.id.tfNomePet);
        tfEspecie = (TextView) findViewById(R.id.tfEspecie);
        tfRastreador = (TextView) findViewById(R.id.tfRastreador);
        btCadastrar = (Button) findViewById(R.id.btnCadastro);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    salvarUsuario(String.valueOf(tfNomeDono), String.valueOf(tfEmail),
                            String.valueOf(tfEndereco), String.valueOf(tfTelefone), String.valueOf(tfNomePet)
                            , String.valueOf(tfEspecie), String.valueOf(tfRastreador));
                }
            });

        }


    private void salvarUsuario(String nomeDono, String email, String telefone, String endereco, String nomePet, String especie, String rastreador) {
        Usuario usuario = new Usuario(nomeDono, email, telefone,endereco,nomePet, especie,rastreador);

        myRef.child("banco_encontraPet").child(email).setValue(usuario);
    }
}
