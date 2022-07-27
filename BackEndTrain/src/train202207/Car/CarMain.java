package train202207.Car;

// inner class 테이스 입니다.
public class CarMain {
    public static void main(String[] args) {
        Car c = new Car(120,"g하하하하");
        System.out.println(c.drive("??",10));
        c.getCar("213",123);
    }
}

class Car{
    private int speed;
    private String Name;

    public Car(){}

    public Car(int c, String n){
        this.speed = c;
        this.Name = n;
    }


    public CarAudioable getCar(String singer,int value){
        // final int NUM=11; 은 지역클래스 접근 가능 final이 붙어야 된다.
        // 지역클래스
        class CarAudio implements CarAudioable{
            private int volumn;
            private String singer;

            public CarAudio(int volumn, String singer) {
                this.volumn = volumn;
                this.singer = singer;
            }

            public String music(){
                return " 볼륨 "+volumn + "가수 누구게 : " + singer+" vlaue "+singer;
            }
            @Override
            public String Auable(){
                return this.music() + "이용가능합니다. ";
            }

        }
        CarAudio ac = new CarAudio(value,singer );
        return ac;
    }


    public String drive(String singer, int volume){
        CarAudioable ca = this.getCar(singer, volume);
        return ca.Auable() +" 속도 " + speed ;
    }

}