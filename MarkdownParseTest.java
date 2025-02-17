import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("my-test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com", "some-thing.html");

        assertEquals(expected, links);
    }

    
    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com", "some-page.html");

        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        boolean empty = links.isEmpty();

        assertEquals(true, empty);
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        boolean empty = links.isEmpty();

        assertEquals(true, empty);
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("page.com");

        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("page.com");

        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        boolean empty = links.isEmpty();

        assertEquals(true, empty);
    }
    
     

   

    
}
