package train202207.stream;

import javax.print.attribute.standard.Finishings;
import java.io.*;

public class StreamBasic {
    public static void main(String[] args) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        try{
            infile = new FileInputStream(new File("C:\\practice\\BackEndTrain\\src\\train202207\\trainmemo.txt"));
            outfile = new FileOutputStream(new File("C:\\practice\\BackEndTrain\\src\\train202207\\trainmemo2.txt"));
            long st = System.currentTimeMillis();
            for (int i =0; (i = infile.read()) != -1;){
                outfile.write(i);
            }
            long end = System.currentTimeMillis();
            System.out.println((end-st)/1000 +" 초입니다. ");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if ( infile !=null){
                try{
                    infile.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if ( outfile !=null){
                try{
                    outfile.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
    public void buffer(String args[]){
        BufferedInputStream infile = null;
        BufferedOutputStream outfile = null;
        try{

            infile = new BufferedInputStream( new FileInputStream(args[0]));
            outfile = new BufferedOutputStream( new FileOutputStream(args[1]));

            long st = System.currentTimeMillis();
            for (int i =0; (i = infile.read()) != -1;){
                outfile.write(i);
            }
            long end = System.currentTimeMillis();
            System.out.println((end-st)/1000 +" 초입니다. ");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if ( infile !=null){
                try{
                    infile.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if ( outfile !=null){
                try{
                    outfile.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
