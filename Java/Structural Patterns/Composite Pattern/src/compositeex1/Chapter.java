package compositeex1;

import java.util.ArrayList;

public class Chapter implements Content{

    private String title;
    private ArrayList<Content> contents;

    public Chapter(String title) {
        this.title = title;
        contents = new ArrayList<>();
    }

    @Override
    public void Operation() {
        System.out.println("<b>" + title + "</b>");
        for (Content content:contents) {
            content.Operation();
        }
    }

    @Override
    public void Add(Content content) {
        contents.add(content);
    }

    @Override
    public void Remove(Content content) {
        contents.remove(content);
    }

    @Override
    public Content getChild(int i) {
        return contents.get(i);
    }
}
