package pe.edu.upc.carcare.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.List;

import pe.edu.upc.carcare.CarCareApp;
import pe.edu.upc.carcare.R;
import pe.edu.upc.carcare.adapters.FuelUpEntriesAdapter;
import pe.edu.upc.carcare.models.FuelUpEntry;

public class FuelUpEntriesActivity extends AppCompatActivity {
    RecyclerView fuelTypeEntriesRecyclerView;
    FuelUpEntriesAdapter fuelUpEntriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_up_entries);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fuelTypeEntriesRecyclerView = (RecyclerView) findViewById(R.id.fuelUpEntriesRecyclerView);
        fuelUpEntriesAdapter = new FuelUpEntriesAdapter();
        fuelUpEntriesAdapter.setFuelUpEntries(CarCareApp.getInstance().getFuelUpEntries());
        fuelTypeEntriesRecyclerView.setAdapter(fuelUpEntriesAdapter);
        fuelTypeEntriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),AddFuelUpEntryActivity.class));
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
