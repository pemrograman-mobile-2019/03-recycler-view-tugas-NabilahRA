package com.example.recyclerviewtugas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewtugas.models.Contact;
import com.example.recyclerviewtugas.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    private List<Contact> contactList;

    public ContactsAdapter(List<Contact> contactList) {

        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View filmView = inflater.inflate(R.layout.item_contact, viewGroup, false);

        return new ViewHolder(filmView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Contact contact = contactList.get(i);

        if (contact.getImg() != null) {
            Picasso.get().load(contact.getImg()).into(viewHolder.imageView);
        } else {
            Picasso.get().load(contact.getImg_local()).into(viewHolder.imageView);
        }

        viewHolder.textView.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        TextView descView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_contact_img);
            textView = itemView.findViewById(R.id.item_contact_name);
            descView = itemView.findViewById(R.id.item_contact_desc);
        }
    }

}