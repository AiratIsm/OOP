package houses;

public class Villa {
    private Fundation fundation;
    private Residents[] residents;

    public Villa(Fundation fundation){
        this.fundation=fundation;
    }

    public void setResidents (Residents[] residents){
        this.residents=residents;
    }
}
