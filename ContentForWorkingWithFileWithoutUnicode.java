import java.io.IOException;

public class ContentForWorkingWithFileWithoutUnicode implements Content {
    private final Content content;

    public ContentForWorkingWithFileWithoutUnicode(Content c) {
        this.content = c;
    }

    @Override
    public String read() throws IOException {
        return this.content.read().replaceAll("[^\\x00-\\x7F]", "");
    }

    @Override
    public void save(String content) throws IOException {
        this.content.save(content);
    }
}