import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GrouperTest {

    @Test
    public void nullStringShouldReturnEmptyCollection() {
        Map<String, List<String>> output = Grouper.group(null);
        assertTrue(output.isEmpty());
    }

    @Test
    public void emptyStringShouldReturnEmptyCollection() {
        Map<String, List<String>> output = Grouper.group("");
        assertTrue(output.isEmpty());
    }

    @Test
    public void oneWordShouldReturnEmptyCollection() {
        String input = "test";
        Map<String, List<String>> output = Grouper.group(input);
        assertTrue(output.isEmpty());
    }

    @Test
    public void grouperShouldIgnoreDuplicates() {
        String input = "test test test";
        Map<String, List<String>> output = Grouper.group(input);
        assertTrue(output.isEmpty());
    }

    @Test
    public void threeWordsThatStartsFromTheSameLetterShouldBeInOneGroup() {
        String input = "aaa aab abb";
        Map<String, List<String>> output = Grouper.group(input);
        assertEquals("[a=[aaa, aab, abb]]", output.entrySet().toString());
    }

    @Test
    public void groupsKeysShouldBeOrdered() {
        String input = "ccc ccd zzy zzz bbb bbc";
        Map<String, List<String>> output = Grouper.group(input);
        assertEquals("[b=[bbb, bbc], c=[ccc, ccd], z=[zzy, zzz]]",
                output.entrySet().toString());
    }

    @Test
    public void wordsInsideGroupsShouldBeOrderedByLengthAndAlsoInNaturalOrder() {
        String input = "aaa aab aaaa aaaaa";
        Map<String, List<String>> output = Grouper.group(input);
        assertEquals("[a=[aaaaa, aaaa, aaa, aab]]", output.entrySet().toString());
    }

    @Test
    public void testFromTheTask() {
        String input = "сапог сарай арбуз болт бокс биржа";
        Map<String, List<String>> output = Grouper.group(input);
        assertEquals("[б=[биржа, бокс, болт], с=[сапог, сарай]]",
                output.entrySet().toString());
    }

    @Test
    public void slightlyImprovedTestFromTheTask() {
        String input = "якорь янтарь ярмо сарай сапог арбуз болт бакс биржа тест";
        Map<String, List<String>> output = Grouper.group(input);
        assertEquals("[б=[биржа, бакс, болт], с=[сапог, сарай], я=[янтарь, якорь, ярмо]]",
                output.entrySet().toString());
    }
}