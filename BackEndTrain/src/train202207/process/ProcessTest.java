package train202207.process;

import java.io.IOException;

public class ProcessTest {

    public static void main(String[] args) throws IOException,InterruptedException {
        Process p =Runtime.getRuntime().exec("write.exe"); // 워드 창 실행
        p.waitFor();
        System.out.println("안녕히 ");
        System.out.close();
        //p.destroy();// 바로 끄기
    }

}



