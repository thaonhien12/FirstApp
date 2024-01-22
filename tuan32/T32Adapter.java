package com.example.firstapp.tuan32;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstapp.R;

import java.util.ArrayList;
public class T32Adapter extends BaseAdapter {
    private ArrayList<T32Contact> ls;
    private Context context;
    public T32Adapter(ArrayList<T32Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    //lay ve so luong item
    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //B1: TAO VIEW
        ViewAX vax;
        //neu chua co view thi ta tao view moi
        if(convertView ==null)
        {
            vax =new ViewAX();
            //anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item,null);
            //anh xa tung tp trong layout
            vax.img_hinh = convertView.findViewById(R.id.t32ItemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t32ItemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t32ItemTuoi);
            //tao timeplate de lan sau dung
            convertView.setTag(vax);
        }

        //neu da co view r thif sdung view cu
        else {
            vax= (ViewAX) convertView.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    //dinh nghia view
    class ViewAX {
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
