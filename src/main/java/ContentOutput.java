import java.io.IOException;
/**
 * ContentOutput interface provides for content (text matter of data source) writing
 */
public interface ContentOutput {
    /**
     * Writes @{code java.lang.String} content
     * @param content @{code java.lang.String} content which you want to write
     * @throws IOException If an input or output exception occurred
     */
    void write(String content) throws IOException;
}
