package compositeex1;

public class Picture implements Content{
    private String picPath;

    public Picture(String picPath) {
        this.picPath = picPath;
    }
    @Override
    public void Operation() {
        System.out.println("<img src='" + picPath + "' />");
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
