package de.storch.fluchomat;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	
    private FluchomatActivity mContext;

    public ImageAdapter(FluchomatActivity c) {
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
        ImageButton imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageButton(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					mContext.playSound(position + 1);
					
				}
			});
        } else {
            imageView = (ImageButton) convertView;
        }

        imageView.setBackgroundResource(R.layout.pushbutton);
        return imageView;
    }

}