package br.org.soares.appcatalogodeacessos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SOARES on 20/06/2016.
 */
public class ServicoListAdapter extends BaseAdapter {

    private Context context;
    private List<Servico> servicos;

    public ServicoListAdapter(Context context, List servicos) {
        this.context = context;
        this.servicos = servicos;
    }

    @Override
    public int getCount() {
        return servicos.size();
    }

    @Override
    public Object getItem(int position) {
        return servicos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.item_servico_list, null);
        TextView txtLetra = (TextView) view.findViewById(R.id.item_txtLetra);
        TextView txtServico = (TextView) view.findViewById(R.id.item_txtServico);
        TextView txtLogin = (TextView) view.findViewById(R.id.item_txtLogin);
        txtLetra.setText(servicos.get(position).getProvedor().substring(0).toUpperCase());
        txtServico.setText(servicos.get(position).getProvedor());
        txtLogin.setText(servicos.get(position).getLogin());
        return view;
    }
}
