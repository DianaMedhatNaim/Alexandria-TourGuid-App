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
public class HotelsFragment extends Fragment {
    public HotelsFragment() {// Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.category_address1,R.string.فندق_ميديترينيان_أزور,R.drawable.pic1, R.string.category_numbers1));
        words.add(new Word(R.string.category_address2,R.string.فندق_توليب,R.drawable.tolip, R.string.category_numbers2));
        words.add(new Word(R.string.category_address3,R.string.فندق_رومانس,R.drawable.pic2,R.string.category_numbers3));
        words.add(new Word( R.string.category_address4,R.string.فندق_ويندسور_إن_باليس,R.drawable.pic6, R.string.category_numbers4));
        words.add(new Word(R.string.category_address5,R.string.فندق_هيلتون_كورنيش_الإسكندرية,R.drawable.pic4, R.string.category_numbers5));
        words.add(new Word(R.string.category_address6,R.string.فور_سيزونز_الإسكندرية,R.drawable.pic5,R.string.category_numbers6));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_Hotels);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);}});return rootView;}}

