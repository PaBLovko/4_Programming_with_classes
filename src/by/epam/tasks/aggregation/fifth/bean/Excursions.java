package by.epam.tasks.aggregation.fifth.bean;

public class Excursions extends Tour {
       
    public Excursions(int cost,String transport,boolean food,int numberOfDays){
        super(cost,transport,food,numberOfDays);
        this.type="excursions";
    }

    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}

