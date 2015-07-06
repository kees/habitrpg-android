package com.magicmicky.habitrpgwrapper.lib.models;

import com.habitrpg.android.habitica.HabitDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.Date;

/**
 * Created by MagicMicky on 16/03/14.
 */

@Table(databaseName = HabitDatabase.NAME)
public class Items extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    private String currentMount, currentPet;

    @Column
    private int lastDrop_count;

    @Column
    private Date lastDrop_date;

    //private Quest quest;


    public Items(String currentMount, String currentPet, int lastDrop_count, Date lastDrop_date) {
        this.currentMount = currentMount;
        this.currentPet = currentPet;
        this.lastDrop_count = lastDrop_count;
        this.lastDrop_date = lastDrop_date;
    }

    public String getCurrentMount() {
        return currentMount;
    }

    public void setCurrentMount(String currentMount) {
        this.currentMount = currentMount;
    }

    public String getCurrentPet() {
        return currentPet;
    }

    public void setCurrentPet(String currentPet) {
        this.currentPet = currentPet;
    }

    public int getLastDrop_count() {
        return lastDrop_count;
    }

    public void setLastDrop_count(int lastDrop_count) {
        this.lastDrop_count = lastDrop_count;
    }

    public Date getLastDrop_date() {
        return lastDrop_date;
    }

    public void setLastDrop_date(Date lastDrop_date) {
        this.lastDrop_date = lastDrop_date;
    }

    public Items() {}
}