package houses;

public class House {

    private Fundation fundation;
    private Residents[] residents;

    public House(Fundation fundation){
        this.fundation=fundation;
    }

    public void setResidents (Residents[] residents){
        this.residents=residents;
    }
}
