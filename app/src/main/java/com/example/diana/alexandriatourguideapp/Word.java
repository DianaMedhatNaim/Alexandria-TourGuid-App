package com.example.diana.alexandriatourguideapp;
/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {
    private int mname;
    /** String resource ID for theaddress */
    private int maddress;
    /** number */
    private int mnumber;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     *
     * @param name is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param address is the string resource Id for the word in the Miwok language
     * @param number is the resource ID for the audio file associated with this word
     */
    public Word(int name, int address, int number) {
        mname = name;
        maddress = address;
        mnumber = number; }
    /**
     *
     * @param name is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param address is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param number is the resource ID for the audio file associated with this word
     */
    public Word(int name, int address, int imageResourceId,
                int number) { mname = name;
        maddress = address;
        mImageResourceId = imageResourceId;
        mnumber = number;}
    /**
     * Get the string resource ID for the name of the word.
     */
    public int getname() {
        return mname;
    }
    /**
     * Get the string resource ID for the address.
     */
    public int getaddress() {
        return maddress;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Return the number.
     */
    public int getnumber() {
        return mnumber;}}