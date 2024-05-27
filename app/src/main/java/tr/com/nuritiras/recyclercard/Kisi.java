package tr.com.nuritiras.recyclercard;

public class Kisi {
    private String ad;
    private int yas;
    private String meslek;
    private int resimId;

    public Kisi(String ad, int yas, String meslek, int resimId) {
        this.ad = ad;
        this.yas = yas;
        this.meslek = meslek;
        this.resimId = resimId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }

}
