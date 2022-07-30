package train202207.stream;

import java.io.*;

class NonSerial{
    int v1;
    public NonSerial(){};
    public NonSerial(int v){
        this.v1 = v;
    }
}


// 직렬화관련 복습이 필요합니다.
public class SerializableTest extends NonSerial implements Serializable {
    int v2;
    transient String v3;
    SerializableTest next;

    // writeObject
    private void writeO(ObjectOutputStream stream ) throws IOException{
        stream.defaultWriteObject();
        stream.writeInt(v1);
        System.out.println("직렬화 중입니다. !!!!!");
    }

    // class cast Exception 오류가 나옵니다.
    // readObject
    private void readO(ObjectInputStream stream ) throws IOException, ClassNotFoundException{
        stream.defaultReadObject();
        v1 = stream.readInt();
        System.out.println("역 직렬화 중입니다. !!!!!");
    }


    public SerializableTest(int v1, int v2, String v3){
        super(v2);
        this.v2 = v2;
        this.v3 = v3;
    }
    public void print(){
        System.out.println(v1+""+v2+""+v3);
        if(next ==null) System.out.println("null-------");
        else next.print();
    }
    public static void main(String[] args) {
        SerializableTest node1 = new SerializableTest(1,11,"first");
        SerializableTest node2 = new SerializableTest(2,12,"second");
        SerializableTest node3 = new SerializableTest(3,13,"third");
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        try{
            FileOutputStream outfile = new FileOutputStream("test.out");
            ObjectOutput out = new ObjectOutputStream(outfile);
            out.writeObject(node1);// 직열화 시작. == writeo
            out.flush();
            out.close();

            FileInputStream infile = new FileInputStream("test.out");
            ObjectInput in = new ObjectInputStream(infile);
            SerializableTest inNode = (SerializableTest) in.readObject();// 역직렬화 부분입니다. == read0
            //SerializableTest inNode2 = (SerializableTest) in.readO();// 역직렬화 부분입니다. == read0
            node1.print();
            node2.print();
            in.close();


        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
