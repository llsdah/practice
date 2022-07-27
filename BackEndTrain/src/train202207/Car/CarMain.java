package train202207.Car;

// inner class 테이스 입니다.
public class CarMain {
    public static void main(String[] args) {
        Car c = new Car(120,"g하하하하");
        System.out.println(c.drive("??",10));
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

    class CarAudio{
        private int volumn;
        private String singer;

        public CarAudio(int volumn, String singer) {
            this.volumn = volumn;
            this.singer = singer;
        }

        public String music(){
            return " 볼륨 "+volumn + "가수 누구게 : " + singer;
        }
    }

    public String drive(String singer, int volume){
        CarAudio ca = new CarAudio(volume,singer);
        return ca.music()+" 속도 " + speed;
    }

}