import com.luoye.dpt.util.Md5Utils;
import com.luoye.dpt.util.ShaUtils;

/**
 * Created by luoyesiqiu
 */
public class Test {

    @org.junit.Test
    public void testFormat(){
        String ret = String.format("0x%02x ~ 0x%02x",12,255);
        System.out.printf(ret);
    }


    @org.junit.Test
    public void testMd5(){
        System.out.println(Md5Utils.md5("hello".getBytes()));
    }

    @org.junit.Test
    public void testSha256(){
        System.out.println(ShaUtils.sha256("hello".getBytes()));
    }

    @org.junit.Test
    public void testSha256l(){
        System.out.println(ShaUtils.shortSha256Left("".getBytes()));
    }

    @org.junit.Test
    public void testSha256r(){
        System.out.println(ShaUtils.shortSha256Right("".getBytes()));
    }

}
