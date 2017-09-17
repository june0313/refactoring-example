package chapter08._05_replace_array_with_object.example;

public class Performance {
    private String[] data = new String[3];

    public String getName() {
        return data[0];
    }

    public void setName(String name) {
        this.data[0] = name;
    }

    public Integer getWins() {
        return Integer.parseInt(data[1]);
    }

    public void setWins(String wins) {
        this.data[1] = wins;
    }
}
