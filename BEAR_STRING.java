public enum BEAR_STRING {
    SLASH("/"),
    BACKSLASH("\\");
    private String value;
    private BEAR_STRING (String value)
    {
        this.value = value;
    }
    public String toString()
    {
        return this.value;
    }
}
