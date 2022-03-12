package datlx.learn.thangcoder.contacts.models;

public class Contact {
    private String mName;
    private String mPhone;
    private boolean isMale;

    public Contact(String mName, String mPhone, boolean isMale) {
        this.mName = mName;
        this.mPhone = mPhone;
        this.isMale = isMale;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
