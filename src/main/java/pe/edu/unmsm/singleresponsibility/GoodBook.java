package pe.edu.unmsm.singleresponsibility;

public class GoodBook {

    private String name;
    private String author;
    private String text;

    //constructor, getters y setters

    //métodos que se relacionan directamente con las propiedades del libro
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

}
