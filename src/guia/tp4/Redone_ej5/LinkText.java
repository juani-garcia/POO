package guia.tp4.Redone_ej5;

public class LinkText extends FormatText{
    public LinkText(HTMLText text, String URL){
        super(text, URL);
    }

    public String source(){
        return String.format("<a href: \"%s\"> %s </a>", aux, text.source());
    }

    @Override
    public String toString() {
        return source();
    }
}
