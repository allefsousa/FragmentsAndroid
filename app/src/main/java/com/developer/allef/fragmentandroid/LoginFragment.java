package com.developer.allef.fragmentandroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private TextView texto;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false); // instanciando uma view para poder inflar
        // Inflate the layout for this fragment
        texto = (TextView)view.findViewById(R.id.tvlogin); // fazendo referencia ao objeto  Text view da view
        texto.setText("Tela de Login Alterada"); // alterando o texto da view
        return view;

    }

}
