package com.example.recyclerviewtugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtugas.adapter.ContactsAdapter;
import com.example.recyclerviewtugas.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("1", "Coban Rondo Malang","", R.drawable.cobanrondo));
        contactList.add(new Contact("2", "Hawai Waterpark","", R.drawable.hawai));
        contactList.add(new Contact("3", "Jodipan Malang","", R.drawable.jodipan));
        contactList.add(new Contact("4", "Teluk Bidadari","" ,R.drawable.Teluk_Bidadari_Malang_758x504));
        contactList.add(new Contact("5", "Coban Rais","" ,R.drawable.cobanrais));
        contactList.add(new Contact("6", "Museum Angkut","" , R.drawable.Museum_Angkut_Kota_Batu));
        contactList.add(new Contact("7", "Coban Parang Tejo", "", R.drawable.Jembatan_Panjang_via_roffi999));

        ContactsAdapter adapterContacts = new ContactsAdapter(contactList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvContacts);
        recyclerView.setAdapter(adapterContacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
