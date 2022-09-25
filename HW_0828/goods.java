package HW_0828;

import java.util.*;
import java.util.jar.Attributes.Name;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class goods {
	// 產品
	Vector goods = new Vector();
	private HashMap<String, String> name = new HashMap<>();
	private HashMap<String, Integer> quality = new HashMap<>();
	private HashMap<String, Integer> purchase = new HashMap<>();
	private HashMap<String, Integer> selling = new HashMap<>();
	// 顧客
	Vector customerList = new Vector<>();
	HashMap shop = new HashMap<>();
	private HashMap<String, Integer> shopCar = new HashMap<>();
	private HashMap<String, String> PNO = new HashMap<>();

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

	void showCar() {
	}

	void Car(String name, int qua) {
	}

	void Pno() {
	}
public static void main(String[] args) {
	goods g=new goods();
	g.basel();
	g.showdatabase();
	g.stuck("舒跑",20);
	g.replaceP("舒跑", 30);
	g.showdatabase();
}
}
