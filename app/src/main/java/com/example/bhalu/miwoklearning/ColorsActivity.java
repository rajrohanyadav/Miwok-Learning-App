package com.example.bhalu.miwoklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "wetetti", R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiite", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "topise", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));

        ListView listView = (ListView) findViewById(R.id.list);

        WordAdapter adapter = new WordAdapter(this, words);

        listView.setAdapter(adapter);

    }
}
