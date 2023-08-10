package encapsulation;

public class C07_ModelAraba extends C05_Araba {
    private String model="A6";
    @Override
    public String getMarka() {
        return super.getMarka();
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getYakitTuru() {
        return super.getYakitTuru();
    }

    @Override
    public void setYakitTuru(String yakitTuru) {
        super.setYakitTuru(yakitTuru);
    }

    @Override
    public int getUretimYili() {
        return super.getUretimYili();
    }

    @Override
    public void setUretimYili(int uretimYili) {
        super.setUretimYili(uretimYili);
    }

    @Override
    public String toString() {
        return "C05_Araba{" +
                "marka='" + getMarka() + '\'' +
                ", model='" + model + '\'' +
                ", yakitTuru='" + getYakitTuru() + '\'' +
                ", uretimYili=" + getUretimYili() +
                '}';

    }
}
