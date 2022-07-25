package train202207.callback;

public class Orders {
    private  WareHouse wareHouse;

    public Orders(){
    }
    public void order(String goods){
        wareHouse = new WareHouse();
        wareHouse.Verity(goods,this);
    }
    public void callback(boolean flag){
        if(flag) System.out.println("고고. 참");
        else System.out.println("안댐 바부 아니요");

    }
}

