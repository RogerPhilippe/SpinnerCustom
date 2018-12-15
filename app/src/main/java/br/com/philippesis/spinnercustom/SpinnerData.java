package br.com.philippesis.spinnercustom;

public class SpinnerData {

    private int id;
    private String mMainLabel;
    private String mSecundaryLabel;

    public SpinnerData(int id, String mMainLabel, String mSecundaryLabel) {
        this.id = id;
        this.mMainLabel = mMainLabel;
        this.mSecundaryLabel = mSecundaryLabel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmMainLabel() {
        return mMainLabel;
    }

    public void setmMainLabel(String mMainLabel) {
        this.mMainLabel = mMainLabel;
    }

    public String getmSecundaryLabel() {
        return mSecundaryLabel;
    }

    public void setmSecundaryLabel(String mSecundaryLabel) {
        this.mSecundaryLabel = mSecundaryLabel;
    }

}
