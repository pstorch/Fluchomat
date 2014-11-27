package de.storch.fluchomat;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class ListAdapter extends BaseAdapter {
	
    private FluchomatActivity mContext;

    public ListAdapter(FluchomatActivity c) {
        mContext = c;
    }

    public int getCount() {
        return 16;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        Button listItem;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            listItem = new Button(mContext);
            listItem.setText(mContext.getSoundText(position));
            listItem.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    mContext.playSound(position);
                }
            });
        } else {
            listItem = (Button) convertView;
        }

        return listItem;
    }

}