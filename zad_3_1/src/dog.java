public class dog {
    private String nazwa;
    private String rasa;

    public dog (String nazwa, String rasa) {
        this.nazwa = nazwa;
        this.rasa = rasa;
    }




    public String getNazwa() {
        return nazwa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return "dog{" +
                "nazwa='" + nazwa + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
