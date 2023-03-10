//資一A 09156146 張庭禎
package HW09_09156146_1092;
import java.io.*;
import java.util.*;
public class HW09_Ex02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\IN0528.TXT");//接檔案
		Scanner input = new Scanner(file);//將檔案給Scanner
		ArrayList<String> name = new ArrayList<>();//建名字的陣列
		ArrayList<String> team = new ArrayList<>();//建隊伍的陣列
		while(input.hasNext()) {
			name.add(input.next());
			team.add(input.next());
		}//將檔案內的資料傳到各自的陣列
		input.close();//關檔案
		
		for(int i = 0; i<team.size(); i++) {
			System.out.print(team.get(i) + ": ");//印出第一個隊伍
			int count = 1;//計算隊伍人數
			for(int j = i+1; j<team.size(); j++) {
				if(team.get(j).equals(team.get(i))) {
					count++;//隊伍人數+1
					team.remove(j);//將重複的移除
					j--;//因移除一筆資料，位置j要-1
				}
			}
			System.out.println(count);//印出該隊伍的人數
		}
	}

}
