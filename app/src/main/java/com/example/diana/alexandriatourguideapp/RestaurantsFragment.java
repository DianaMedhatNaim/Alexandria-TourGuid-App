package com.example.diana.alexandriatourguideapp;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {// Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.category_address7,R.string.روسترى_فؤاد, R.string.category_numbers7));
        words.add(new Word(R.string.category_address8,R.string.countryhills,  R.string.category_numbers8));
        words.add(new Word(R.string.category_address3,R.string.سي_جل, R.string.category_numbers9));
        words.add(new Word( R.string.category_address9,R.string.وايت_أند_بلو, R.string.category_numbers10));
        words.add(new Word( R.string.category_address10,R.string.latino, R.string.category_numbers11));
        words.add(new Word(R.string.category_address11,R.string.جاد, R.string.category_numbers12));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_Restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position); }});
        return rootView;}}

