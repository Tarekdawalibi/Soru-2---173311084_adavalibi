package ogrenci;

public class Kisiler {
    String isim;
    String cinsiyet;
    int yas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Kisiler(String isim, String cinsiyet, int yas) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
    public Kisiler()
    {
    	
    }
}