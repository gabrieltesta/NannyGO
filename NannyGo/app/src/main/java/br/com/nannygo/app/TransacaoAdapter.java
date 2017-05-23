package br.com.nannygo.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TransacaoAdapter extends ArrayAdapter<Transacao>
{
    int resource;
    View view;
    TextView id_transacao, id_usuario, id_baba, data_transacao, metodo_pagamento;
    Transacao transacao;

    public TransacaoAdapter(Context context, int resource, List<Transacao> objects)
    {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        view = convertView;
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(resource, null);
        }

        transacao = getItem(position);
        pegarView();
        inserirCamposLayout();

        return view;
    }

    private void inserirCamposLayout() {
        id_transacao.setText(transacao.getIdTransacao().toString());
        id_usuario.setText(transacao.getIdUsuario().toString());
        id_baba.setText(transacao.getIdBaba().toString());
        data_transacao.setText(transacao.getData_transacao());
        metodo_pagamento.setText(transacao.getMetodo_pagamento());
    }


    public void pegarView(){
        id_transacao = (TextView) view.findViewById(R.id.id_transacao);
        id_usuario = (TextView) view.findViewById(R.id.id_usuario);
        id_baba = (TextView) view.findViewById(R.id.id_baba);
    }

}