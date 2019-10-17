package com.example.projetcontact.objet;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "numero_table",
        foreignKeys = @ForeignKey(entity = Contact.class,
                                  parentColumns = "id",
                                  childColumns = "contact_id"))
public class Numero {
    @NonNull
    @PrimaryKey
    private String numero;

    private String categorie;
    @ColumnInfo(name = "contact_id") public int contactId;

    public Numero (String num, String category, int id){
        this.numero = num;
        this.categorie = category;
        this.contactId = id;
    }

    public Numero (){
        this.numero = "";
        this.categorie = "";
        this.contactId = 0;
    }

    public String getCategorie(){ return categorie; }

    public String getNumero() {
        return numero;
    }

    public void setCategorie(String category) {
        this.categorie = category;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int id) {
        this.contactId = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @NonNull
    @Override
    public String toString() {
        return "numero : " + this.numero + "category : " + this.categorie;
    }
}