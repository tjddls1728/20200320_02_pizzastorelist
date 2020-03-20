package kr.co.a20200320_02_pizzastorelist.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

import kr.co.a20200320_02_pizzastorelist.R;
import kr.co.a20200320_02_pizzastorelist.datas.pizzaStore;

public class PizzaStoreAdapter extends ArrayAdapter<pizzaStore> {

    Context mContext;
    List<pizzaStore> mList;
    LayoutInflater inf;

    public PizzaStoreAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);

    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null){
            row=inf.inflate(R.layout.pizza_store_list_item,null);

        }
        pizzaStore data = mList.get(position);

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        nameTxt.setText(data.getStoreName());
        Glide.with(mContext).load(data.getLogUrl()).into(logoImg);



        return row;
    }



}
