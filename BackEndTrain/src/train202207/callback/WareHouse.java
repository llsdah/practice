package train202207.callback;

import java.util.HashMap;

public class WareHouse {
    private HashMap<String, Integer> goods;
    public WareHouse(){
        goods = new HashMap<String, Integer>();

        goods.put("참외",3);
        goods.put("바나나",2);
    }

    public void Verity(String goods,Orders order){

        boolean flag = false;

        for (String temp : this.goods.keySet()) {
            if( temp != null &&temp.equals(goods)) flag = true;
        }

        if(!flag) return;

        int value = this.goods.get(goods);

        if(value>0){
            value--;
            System.out.print("원래 이정도 에서 "+this.goods.get(goods));
            this.goods.put(goods,value);
            System.out.println("  이정도 남았다. 이제"+this.goods.get(goods));
            order.callback(true);
        }else{
            order.callback(false);
        }

    }


}
