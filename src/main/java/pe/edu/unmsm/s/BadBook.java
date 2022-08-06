package pe.edu.unmsm.s;

public class BadBook {

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

    //métodos para enviar el texto a la consola - esto no debería estar aquí
    void printTextToConsole(){
        //código para formatear e imprimir el texto
    }

}
