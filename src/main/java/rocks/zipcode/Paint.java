package rocks.zipcode;

public class Paint {
    private String brand;
    private String paintName;
    private String paintType = "";//{"Ink", "Contrast", "Wash", "Generic"};

    public Paint(String brand, String paintName, String paintType){
        this.brand = brand;
        this.paintName = paintName;
        this.paintType = paintType;
    }










    //Getter and Setters below this point
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public String getBrand(){
        return brand;
    }
    public String getPaintName(){
        return paintName;
    }
    public String getPaintType(){
        return paintType;
    }
}
