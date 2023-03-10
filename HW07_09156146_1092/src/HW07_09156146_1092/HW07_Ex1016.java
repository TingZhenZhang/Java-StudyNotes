//資一A 09156146 張庭禎
package HW07_09156146_1092;

import java.math.BigDecimal;

public class HW07_Ex1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal val = BigDecimal.ONE;
		BigDecimal ten = new BigDecimal("10");
		for(int i = 0; i<49; i++) {//將1乘以10，做49次後，得50位數的值
			val = val.multiply(ten);
		}
		BigDecimal d1 = new BigDecimal(2);
		BigDecimal d2 = new BigDecimal(3);
		BigDecimal z = BigDecimal.ZERO;
		int count = 0;//計算印出次數
		while(count<10) {//印10次
			if(val.remainder(d1).equals(z)||val.remainder(d2).equals(z)) {
				System.out.println(val);//若除以2或3的餘數為0則印出被除數
				count++;//印出次數+1
			}
			val = val.add(BigDecimal.ONE);//被除數+1
		}

	}

}
