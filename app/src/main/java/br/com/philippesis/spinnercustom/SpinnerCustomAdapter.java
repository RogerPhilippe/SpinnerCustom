package br.com.philippesis.spinnercustom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SpinnerCustomAdapter extends ArrayAdapter<SpinnerData> {

    private Context mContext;

    public SpinnerCustomAdapter(@NonNull Context context, int resource, List<SpinnerData> list) {
        super(context, resource, list);
        this.mContext = context;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            convertView = View.inflate(mContext, R.layout.spinner_custom_layout, null);
            TextView mainLabel = (TextView) convertView.findViewById(R.id.idtvMainLabel);
            mainLabel.setText(this.getItem(position).getmMainLabel());
            TextView secundaryLabel = (TextView) convertView.findViewById(R.id.idtvSecundaryLabel);
            secundaryLabel.setText(this.getItem(position).getmSecundaryLabel());
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = View.inflate(mContext, R.layout.spinner_custom_layout, null);
        TextView mainLabel = (TextView) view.findViewById(R.id.idtvMainLabel);
        mainLabel.setText(this.getItem(position).getmMainLabel());
        TextView secundaryLabel = (TextView) view.findViewById(R.id.idtvSecundaryLabel);
        secundaryLabel.setText(this.getItem(position).getmSecundaryLabel());

        return view;
    }
}
