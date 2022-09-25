package HW0814;
import java.util.ArrayList;
import java.util.Arrays;
public class train extends Land {

	static final String[] station= {
			"001.基　隆 ",	"002. 八　堵 ",	" 003. 七　堵 ",	"004. 汐　止 ",	"005. 南　港 ",
			"006.松　山 ",	"007. 萬　華 ",	" 008. 板　橋 ",	"009. 樹　林 ",	"010. 鶯　歌 ",
			"011.桃　園 ",	"012. 中　壢 ",	"013. 埔　心 ",	"014. 楊　梅 ",	"015. 富　岡 ",
			"016.湖　口 ",	"017. 新　豐 ",	"018. 竹　北 ",	"019. 新　竹 ",	"020. 三姓橋 ",
			"021.香　山 ",	"022. 南　澳 ",	"023. 東　澳 ",	"024. 蘇　澳 ",	"025. 蘇澳新 ",
			"026.冬　山 ",	"027. 羅　東 ",	"028. 宜　蘭 ",	"029. 礁　溪 ",	"030. 頭　城 ",
			"031.福　隆 ",	"032. 雙　溪 ",	"033. 瑞　芳 ",	"034. 竹　南 ",	"035. 後　龍 ",
			"036.白沙屯 ",	"037. 通　霄 ",	"038. 苑　裡 ",	"039. 日　南 ",	"040. 大　甲 ",
			"041.清　水 ",	"042. 沙　鹿 ",	"043. 龍　井 ",	"044. 豐　富 ",	"045. 苗　栗 ",
			"046.銅　鑼 ",	"047. 三　義 ",	"048. 后　里 ",	"049. 豐　原 ",	"050. 潭　子 ",
			"051.松　竹 ",	"052. 太　原 ",	"053. 精　武 ",	"054. 臺　中 ",	"055. 五　權 ",
			"056.大　慶 ",	"057. 新烏日 ",	"058. 成　功 ",	"059. 彰　化 ",	"060. 員　林 ",
			"061.社　頭 ",	"062. 田　中 ",	"063. 二　水 ",	"064. 林　內 ",	"065. 斗　六 ",
			"066.斗　南 ",	"067. 大　林 ",	"068. 民　雄 ",	"069. 嘉　義 ",	"070. 新　營 ",
			"071.隆　田 ",	"072. 善　化 ",	"073. 新　市 ",	"074. 永　康 ",	"075. 臺　南 ",
			"076.保　安 ",	"077. 中　洲 ",	"078. 大　湖 ",	"079. 路　竹 ",	"080. 岡　山 ",
			"081.橋　頭 ",	"082. 楠　梓 ",	"083. 新左營 ",	"084. 高　雄 ",	"085. 鳳　山 ",
			"086.九曲堂 ",	"087. 屏　東 ",	"088. 西　勢 ",	"089. 潮　州 ",	"090. 南　州 ",
			"091.林　邊 ",	"092. 枋　寮 ",	"093. 大　武 ",	"094. 金　崙 ",	"095. 太麻里 ",
			"096.知　本 ",	"097. 臺　東 ",	"098. 鹿　野 ",	"099. 瑞　源 ",	"100. 關　山 ",
			"101.池　上 ",	"102. 富　里 ",	"103. 東　竹 ",	"104. 東　里 ",	"105. 玉　里 ",
			"106.瑞　穗 ",	"107. 富　源 ",	"108. 光　復 ",	"109. 萬　榮 ",	"110. 鳳　林 ",
			"111.南　平 ",	"112. 林榮新光 ","113. 壽　豐 ",	"114. 志　學 ",	"115. 吉　安 ",
			"116.花　蓮 ",   "117. 新　城 ",	"118. 崇　德 ",	"119. 和　平 "};
	java.util.Scanner keyin=new java.util.Scanner(System.in);
	
	static int w=0;
	static int f=0;
	static int h=0;
	
	void display() {
		System.out.println("請問是1.單人票,2.團體票呢？");
		System.out.println("團體票需20人以上喔！");
		int check=keyin.nextInt();
		check(check);
		

	}
	
	private void check(int check) {
		if(check==1) {
			System.out.println("請問幾張全票幾張半票呢？");
			System.out.print("全票");
			f=scan.nextInt();
			System.out.print("半票");
			h=scan.nextInt();
			System.out.println("總共"+f+"張全票"+h+"張半票");
			System.out.println("請選擇要搭乘哪種車輛？");
			System.out.println("1.區間車2.莒光號/自強號");
			int t=scan.nextInt();
			chooseCar(t);
		}
		else if(check==2) {
			System.out.println("請問共有幾人呢？");
			int person=scan.nextInt();
			if(person>20) {
				chooseStation();
				System.out.println("總金額為:"+(int)(23*person)+"元");
				
			}else {
				System.out.println("請購買單人票喔！");
				check(1);
			}
		}
		else {
			System.out.println("請重新輸入");
			int check1=keyin.nextInt();
			check(check1);
		}
	}
	static void showStation(String station[]) {
		for(int i=1; i<=station.length; i++) {
			System.out.print(station[i-1]+" , ");
			if(i%5==0) {
				System.out.println();
			}
		}
		System.out.println();

	}
	private void chooseCar(int c) {
		switch(c) {
			case 1:
					chooseStation();
					System.out.println("總金額為:"+(int)(15*w*(f+0.6*h))+"元");
					
				break;
			case 2:
					chooseStation();
					System.out.println("總金額為:"+(int)(23*w*(f+0.6*h))+"元");
				break;
			default:
				System.out.println("不存在此選項，請重新輸入");
				int t=scan.nextInt();
				chooseCar(t);
				break;
		}
		
	}
	void chooseStation() {
		showStation(station);
		System.out.println("請輸入起始站");		
		int d=scan.nextInt();
		System.out.println("請輸入目的站");
		int a=scan.nextInt();
		if(!Arrays.asList(station).contains(d)||!Arrays.asList(station).contains(a)){
			System.out.println("輸入錯誤請從新輸入");
			chooseStation();
		}else {
			System.out.println(station[d-1]+"到"+station[a-1]);
			w=Math.abs(d-a);
		}
	}

	
}
