/*
* --------------------------------------------------------
* by Vadim Semenov 2017
* vad.s.semenov@gmail.com
* --------------------------------------------------------
* */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EndOfString {

    public static void main(String[] args) throws IOException {
        convert(System.in, System.out);
    }

    public static void convert(InputStream is, OutputStream os) throws IOException {
        int buf1 = is.read();
        int buf2;

        while (buf1 != -1) {
            buf2 = is.read();
            if (!(buf2 == 10 && buf1 == 13)) {
                os.write(buf1);
            }
            buf1 = buf2;
        }

        os.flush();
    }

}