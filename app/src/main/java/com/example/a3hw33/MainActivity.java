package com.example.a3hw33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        numbers.add("+1 564 217 2000");
        numbers.add("+1 646 931 3860");
        numbers.add("+1 669 444 9171");
        numbers.add("+1 669 900 6833");
        numbers.add("+1 719 359 4580");
        numbers.add("+1 929 205 6099");
        numbers.add("+1 253 215 8782");
        numbers.add("+1 301 715 8592");
        numbers.add("+1 309 205 3325");
        numbers.add("+1 312 626 6799");
        numbers.add("+1 346 248 7799");
        numbers.add("+1 386 347 5053");
        NumberAdapter numberAdapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(numberAdapter);
    }
}