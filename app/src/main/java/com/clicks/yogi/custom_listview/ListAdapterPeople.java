package com.clicks.yogi.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.collection.ArraySet;

import java.util.List;
import java.util.Set;

public class ListAdapterPeople extends BaseAdapter {

    private static final String TAG = ListAdapterPeople.class.getSimpleName();

    private List<Hello> hello;
    private Context context;
    private LayoutInflater layoutInflater;
    private Set<View> viewSet;

    ListAdapterPeople(Context context, List<Hello> hello)
    {
        this.context=context;
        this.hello=hello;
//        this.viewSet = new android.support.v4.util.ArraySet<View>();
    this.viewSet = new ArraySet<View>();
    }

    @Override
    public int getCount() {
        return hello.size();
    }

    @Override
    public Object getItem(int i) {
        return hello.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyViewHolder myViewHolder;

        if(view==null){
            layoutInflater = LayoutInflater.from(this.context);

            view=layoutInflater.inflate(R.layout.row_items,null);
            myViewHolder=new MyViewHolder();

            myViewHolder.textViewName=view.findViewById(R.id.txtName);
            myViewHolder.txtLast=view.findViewById(R.id.txtLastName);
            myViewHolder.txtNational=view.findViewById(R.id.txtTeam);

            view.setTag(myViewHolder);

        }else{
            myViewHolder = (MyViewHolder)view.getTag();
        }

        final Hello hell = hello.get(i);

        myViewHolder.textViewName.setText(hell.getName());
        myViewHolder.txtLast.setText(hell.getLastName());
        myViewHolder.txtNational.setText(hell.getTeam());
        viewSet.add(view);

        return view;
    }

    private static class MyViewHolder{
        TextView textViewName;
        TextView txtLast;
        TextView txtNational;
    }



}
