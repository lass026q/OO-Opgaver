public class Person {

    public String navn;
    public int alder;

    public Person (String navn, int alder){
        this.navn=navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }
    public int getAlder(){
        return alder;
    }
    public void hasBirthday(){
        this.alder++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", alder=" + alder +
                '}';
    }
}

