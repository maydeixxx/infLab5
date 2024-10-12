public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private float price;
    private String regNum;

    public Car(int id, String mark, String model, int year,
                String color, float price, String regNum){
                    this.id = id;
                    this.mark = mark;
                    this.model = model;
                    this.year = year;
                    this.color = color;
                    this.price = price;
                    this.regNum = regNum;
                }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price = price;
    }

    public String getRegNum(){
        return regNum;
    }
    public void setRegNum(String regNum){
        this.regNum = regNum;
    }
            
}
