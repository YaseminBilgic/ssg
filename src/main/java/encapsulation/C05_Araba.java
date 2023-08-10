package encapsulation;

public class C05_Araba {
    private String marka="Audi";

    private String model="model belirtilme";

    private String yakitTuru="yakit turu belirtilmedi";

    private int uretimYili;


    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    @Override
    public String toString() {
        return "C05_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }
}
