package train202207;

public class CopyBasic implements Cloneable{
    int arr[] = {1,2,3,4,5};
    int i=1;

    // 깊은 복사
    public Object clone(){
        try{
            CopyBasic cb1 = (CopyBasic) super.clone();
            cb1.arr = (int[]) arr.clone();
            return cb1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        // 얖은 복사 배열 참조 값만 복사 합니다. (위의 메소드 없으면 얖은 복사 )
        CopyBasic c1 = new CopyBasic();
        CopyBasic c2 = (CopyBasic) c1.clone();
        c1.i =c1.arr[0] =2;
        System.out.println("c1 : "+ c1.i +" c2 : "+c2.i );
        System.out.println("c1 : "+ c1.arr[0] +" c2 : "+c2.arr[0] );

        System.out.println("---------------------------");
        // 깊은 복사
        CopyBasic cb = new CopyBasic();
        CopyBasic cb2 = (CopyBasic) cb.clone(); // 데이터 값 자체를 복사
        cb.i = cb.arr[0]= 3;
        System.out.println("cb : "+ cb.i +" cb2 : "+cb2.i );
        System.out.println("cb : "+ cb.arr[0] +" cb2 : "+cb2.arr[0] );

    }
}
