package br.org.soares.appcatalogodeacessos;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by SOARES on 20/06/2016.
 */
public class MainActivity extends Activity {

    private TextView txtTitulo;
    private List<Servico> servicos;
    private ListView lstServicos;
    private ServicoListAdapter adapter;
    private ImageButton btnAdcionar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtTitulo.setText("Catalogo de Acessos");

        lstServicos = (ListView) findViewById(R.id.lstServicos);

        servicos = new ArrayList<Servico>();
        servicos.add(new Servico("hotmail.com", "fulano@hotmail.com", "123456"));
        servicos.add(new Servico("amazon.com", "fulano_detall", "666"));
        servicos.add(new Servico("Battle.net", "detall", "654321"));

        Collections.sort(servicos, new Comparator<Servico>() {
            @Override
            public int compare(Servico left, Servico right) {
                return left.getProvedor().toLowerCase().compareTo(right.getProvedor().toLowerCase());
            }
        });

        adapter = new ServicoListAdapter(getApplicationContext(), servicos);
        lstServicos.setAdapter(adapter);

        lstServicos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Servico servico = servicos.get(position);
                Toast.makeText(getApplicationContext(), "Senha do serviço selecionado: " + servico.getSenha(), Toast.LENGTH_LONG).show();
            }
        });

        final FragmentManager gerenciador = getFragmentManager();
        final ServicoFragment fragmento = new ServicoFragment();

        btnAdcionar = (ImageButton) findViewById(R.id.btnAdicionar);
        btnAdcionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmento.show(gerenciador, null);
            }
        });
    }
}
