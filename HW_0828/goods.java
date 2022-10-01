package HW_0828;

import java.util.*;
import java.util.jar.Attributes.Name;

import javax.annotation.processing.RoundEnvironment;
import javax.swing.plaf.multi.MultiInternalFrameUI;
public class goods {
	// 產品
	Vector goods = new Vector();
	HashMap<String, String> name = new HashMap<>();
	HashMap<String, Integer> quality = new HashMap<>();
	HashMap<String, Integer> purchase = new HashMap<>();
	HashMap<String, Integer> selling = new HashMap<>();
	

	// 基礎產品
	void basel() {
		goods.add("舒跑");
		name.put("舒跑", "維他露食品股份有限公司");
		quality.put("舒跑", 30);
		purchase.put("舒跑", 18);
		selling.put("舒跑", (int) (purchase.get("舒跑") * 1.3));
	}

	void showdatabase() {
		//try {
			if (goods.size() >= 0) {
				for (int i = 0; i < goods.size(); i++) {
					String good = (String) goods.get(i);
					String supplier = name.get(good);
					int stuck = quality.get(good);
					int pPrice = purchase.get(good);
					int sPrice = selling.get(good);
					System.out.printf("產品名稱：%s\t供應商名稱：%s\n" + "數量：%d罐\t進貨單價：%d元\t銷售單價：%d元\n", good, supplier, stuck,
							pPrice, sPrice);
				}
			} else {
				System.out.println("目前尚無資料");
			}
	}
		/*} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
		}

	}*/

	void customer() {
		try {
			if (goods.size() >= 0) {
				for (int i = 0; i < goods.size(); i++) {
					String good = (String) goods.get(i);
					String supplier = name.get(good);
					int stuck = quality.get(good);
					int sPrice = selling.get(good);
					System.out.printf("產品編號：%d\t產品名稱：%s\t供應商名稱：%s\n" + "數量：%d\t銷售單價：%d\n", (i + 1), good, supplier,
							stuck, sPrice);
				}
			} else {
				System.out.println("目前尚無資料，請聯繫客服專線：0800-123-456");
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");

		}

	}

	void addnew(String good, String supplier, int qual, int price) {
		goods.add(good);
		name.put(good, supplier);
		quality.put(good, qual);
		purchase.put(good, price);
		selling.put(good, (int) (purchase.get(good) * 1.5));

	}

	void stuck(String good, int qual) {
		int newstuck = quality.get(good) + qual;
		quality.replace(good, newstuck);

	}

	void replaceP(String good, int price) {
		purchase.replace(good, price);
		selling.replace(good, (int) (price * 1.5));
	}

	void reduce(String good, int qual) {
		int newSTUCK = quality.get(good) - qual;
		quality.replace(good, newSTUCK);
	}

	int showprice(int qual, int price) {
		return (int) (Math.round(qual * price));

	}
	
	//顧客
		
	
	/*void shopCar(String member,int goodsa,int qua) {
		String purchasNum=String.valueOf(Math.random()*10000);
		String goodS=(String)goods.get(goodsa-1);
		int price=selling.get(goodS);
		int qu=Math.round(qua*price);
		int total;
		qu=qua;
		int  q =quality.get(goodS)+qua;
		quality.replace(goodS, q);
		System.out.println("客戶代號"+member+"產品");
	}*/

public static void main(String[] args) {
	
	goods g=new goods();
	g.basel();
	g.showdatabase();
	//shopCar sCar=new shopCar("M0001",1, 2);
	//String goodS=(String) g.goods.get(1-1);
	g.showdatabase();
}

/*class shopCar{
	goods nGoods=new goods();
	String purchasNum;
	String goodS;
	int qua;
	int price;
	int total;
	shopCar(String member,int goodsa,int qua)
	{	nGoods.basel();
		this.goodS=(String)nGoods.goods.get(goodsa-1);
		this.qua=qua;
		this.purchasNum=String.valueOf(Math.random()*10000);
		this.price=nGoods.selling.get(goodS);
		this.total=Math.round(qua*price);
		int  q =nGoods.quality.get(goodS)+qua;
		nGoods.quality.replace(goodS, q);
	}*/
}