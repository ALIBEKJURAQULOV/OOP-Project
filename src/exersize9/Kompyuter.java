package exersize9;



public class Kompyuter {

    private int id;
    private String name;
    private String type;

    private Configuration configuration;

    @Override
    public String toString() {
        return "Komputer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", configuration=" + configuration +
                '}';
    }

    public Kompyuter(int id, String name, String type, Configuration configuration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.configuration = configuration;
    }
    public Kompyuter(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
    /**
     * Dinamik list berilgan. Listda 10 ta kompyuterlar obyekti joylashgan (obyekt maydonlari:
     * id, name, type, configuration). Dastur kompyuterni sotib olish uchun “id” so’rasin vasotib
     * olingan kompyuterni listdan o’chirib tashlasin? Dastur tuzing?
     * Izoh: configuration – bu obyekt, ya’ni alohida Configuration nomli sinf yaratiladi va har
     * bir kompyuter obyekti uchun configuration obyekt orqali qo’shiladi. Configuration sinf
     * maydonlari (RAM, ROM, CPU, display, registr)
     */

}
