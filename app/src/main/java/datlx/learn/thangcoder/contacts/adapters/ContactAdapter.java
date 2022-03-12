package datlx.learn.thangcoder.contacts.adapters;

import android.content.Context;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import datlx.learn.thangcoder.contacts.R;
import datlx.learn.thangcoder.contacts.models.Contact;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private List<Contact> arrayContact;

    public ContactAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrayContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_contact_listview, parent, false);
            viewHolder.imgAvatar = (ImageView) convertView.findViewById(R.id.img_avatar);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.txt_name);
            viewHolder.tvNumber = (TextView) convertView.findViewById(R.id.txt_phone);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = arrayContact.get(position);

        viewHolder.tvName.setText(contact.getmName());
        viewHolder.tvNumber.setText(contact.getmPhone());

        if (contact.isMale()) {
            viewHolder.imgAvatar.setBackgroundResource(R.drawable.ic_male);
        } else {
            viewHolder.imgAvatar.setBackgroundResource(R.drawable.ic_female);
        }

        return convertView;
    }

    public class ViewHolder {
        ImageView imgAvatar;
        TextView tvName;
        TextView tvNumber;
    }
}