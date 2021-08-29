package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

public enum Animal {
    DOG("пес"), CAT("кіт"), FROG("жаба");

    private String translation;

 //   Animal() {}

    private Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
