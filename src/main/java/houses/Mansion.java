package houses;

public class Mansion {
    private Fundation fundation;
    private Residents[] residents;

    public Mansion(Fundation fundation){
        this.fundation=fundation;
    }

    public void setResidents (Residents[] residents){
        this.residents=residents;
    }
}
