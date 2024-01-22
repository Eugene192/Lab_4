package enums;

public enum Plants {
    ficus("фикус");

    private final String name;

    Plants(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
