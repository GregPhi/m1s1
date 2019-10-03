package com.example.appliccontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ContactViewHolder> {
    class ContactViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomItemView;
        private final TextView ageItemView;

        private ContactViewHolder(View itemView) {
            super(itemView);
            nomItemView = itemView.findViewById(R.id.nom);
            ageItemView = itemView.findViewById(R.id.age);
        }
    }

    private final LayoutInflater mInflater;
    private List<Contact> mContacts; // Cached copy of words

    ContactListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        if (mContacts != null) {
            Contact current = mContacts.get(position);
            holder.nomItemView.setText(current.getNom());
            holder.ageItemView.setText(current.getAge());
        } else {
            // Covers the case of data not being ready yet.
            holder.nomItemView.setText("Prenom");
            holder.ageItemView.setText("Age");
        }
    }

    void setContacts(List<Contact> words){
        mContacts = words;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mContacts != null)
            return mContacts.size();
        else return 0;
    }

}
