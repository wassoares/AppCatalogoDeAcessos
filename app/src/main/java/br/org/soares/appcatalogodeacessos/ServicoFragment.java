package br.org.soares.appcatalogodeacessos;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by SOARES on 21/06/2016.
 */
public class ServicoFragment extends DialogFragment {

    private Button btnOk;
    private EditText edtProvedor;
    private EditText edtLogin;
    private EditText edtSenha;
    private EditText edtAnotacao;
    private TextView txtTitulo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_cad_fragment, null);

        //getDialog().setTitle("Cadastro de Servico");
        /*txtTitulo = (TextView) view.findViewById(R.id.cad_txtTitulo);

        edtProvedor = (EditText) view.findViewById(R.id.cad_edtProvedor);
        edtLogin = (EditText) view.findViewById(R.id.cad_edtLogin);
        edtSenha = (EditText) view.findViewById(R.id.cad_edtSenha);
        edtAnotacao = (EditText) view.findViewById(R.id.cad_edtAnotacao);

        btnOk = (Button) view.findViewById(R.id.cad_btnOk);*/

        return view;
    }

}
