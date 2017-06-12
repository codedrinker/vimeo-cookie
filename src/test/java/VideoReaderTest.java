import com.github.codedrinker.VimeoReader;
import com.github.codedrinker.entity.VimeoData;
import org.junit.Test;

/**
 * Created by codedrinker on 12/06/2017.
 */
public class VideoReaderTest {
    @Test
    public void test_public_video() {
        long start = System.currentTimeMillis();
        VimeoData read = new VimeoReader().read("40056491");
        System.out.println(read);
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test_private_video() {
        long start = System.currentTimeMillis();
        VimeoData read = new VimeoReader().read("718489");
        System.out.println(read);
        System.out.println(System.currentTimeMillis() - start);
    }
}
