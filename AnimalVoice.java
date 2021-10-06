package pl.test.OOP_2;

public enum AnimalVoice {
    DOG("Pies szczeka "),
    CAT("Kot robi "),
    ELEPHANT("Słoń trąbi ");

    private String text;

    AnimalVoice(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
