package com.developer.allef.fragmentandroid;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botaoLogar;
    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogar = (Button) findViewById(R.id.btnlogar);
        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // abrindo o fragmente login na main activity
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // diz que a tranzação foi iniciada


                if (status == true){
                    LoginFragment loginFragment = new LoginFragment();
                    fragmentTransaction.add(R.id.rl_containerfragment,loginFragment);// onde vc quer adicionar o fragmnete e qual o fragmente
                    fragmentTransaction.commit(); // dizendo que terminou a transação
                    botaoLogar.setText("Cadastre-se");
                    status =false;
                }else{
                    // preparando outro fragmente para subtituir o anterior
                    CadastroFragment cadastroFragment = new CadastroFragment();
                    // onde sera colocado o fragmente , qual o fragmente
                    fragmentTransaction.add(R.id.rl_containerfragment,cadastroFragment);
                    fragmentTransaction.commit();
                    botaoLogar.setText("Logar");
                    status = true;
                }
            }
        });




    }






}
