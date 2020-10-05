package guia.tp4.ej5;

public class LinkText extends FormatText{

    public LinkText(HTMLText text, String URL) {
        super(text, URL);
    }

    @Override
    public String source() {
        return String.format("<a href:%s>%s</a>", aux, text);
    }


}
