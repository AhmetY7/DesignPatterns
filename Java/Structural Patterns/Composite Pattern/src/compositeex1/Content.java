package compositeex1;

public interface Content {
    void Operation();
    void Add(Content content);
    void Remove(Content content);
    Content getChild(int i);
}
