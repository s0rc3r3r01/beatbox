package com.example.federico.beatbox;

/**
 * Created by federico on 08/01/2017.
 */

public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }




    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public void setAssetPath(String assetPath) {
        mAssetPath = assetPath;
    }

}
