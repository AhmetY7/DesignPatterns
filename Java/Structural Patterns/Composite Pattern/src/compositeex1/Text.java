package compositeex1;

public class Text implements Content{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void Operation() {
        System.out.println("<p>" + content + "</p>");
    }

    @Override
    public void Add(Content content) {
        return;
    }

    @Override
    public void Remove(Content content) {
        return;
    }

    @Override
    public Content getChild(int i) {
        return null;
    }
}
