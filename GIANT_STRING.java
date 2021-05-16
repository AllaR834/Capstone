public enum GIANT_STRING {
    string1_6("fee"),
    string7_12("fie"),
    string13_18("foe"),
    string19_24("fum");
    private String value;
    private GIANT_STRING (String value)
    {
        this.value = value;
    }
    public String toString()
    {
        return this.value;
    }
}
