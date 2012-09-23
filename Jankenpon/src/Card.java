
public class Card {
	public static class Tefuda{
		public static int gu;
		public static int choki;
		public static int pa;
	}
	
	public static String attack(){
		int rand = 3;
		
		while(Card.Tefuda.gu > 0 || Card.Tefuda.choki > 0	|| Card.Tefuda.pa > 0){
			rand = (int)(Math.random()*10);
			rand = rand%3;		
		
			if(rand == 0 && Card.Tefuda.gu != 0){
				Card.Tefuda.gu--;
				return "グー";
			}
			else if(rand == 1 && Card.Tefuda.choki != 0){
				Card.Tefuda.choki--;
				return "チョキ";
			}
			else if(rand == 2 && Card.Tefuda.pa != 0){
				Card.Tefuda.pa--;
				return "パー";
			}
		}
		
		return "手札がありません";
	}
}
