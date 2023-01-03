package e_oop.game.iLoveCoffe;

public class GameInit {
	public static final Item[] ITEMS = {
			new Item("원두", 100, 50)
			, new Item("생수", 0, 0)
			, new Item("생크림", 200, 100)
			, new Item("아이스크림", 500, 200)
	};
	
	public static final Recipe[] RECIPES = {
			new Recipe("아메리카노", 3000, 30000, ITEMS[0], ITEMS[0], ITEMS[1], ITEMS[1])
			, new Recipe("아포가토", 5000, 60000, ITEMS[0], ITEMS[0], ITEMS[1], ITEMS[3])
	};
	
	public static final String[] FRONT_SCRIPT = {
			"안녕하세요! ", "빨리! ", "소문 듣고 왔어요. ", "매일 먹던 "
	};
	
	public static final String[] BACK_SCRIPT = {
			"빨리 주세요!", "주세요.", "감사합니다.", "주문할게요!", "기다리겠습니다." 
	};
	
	public static final String[] END_SCRIPT = {
			"감사합니다.", "맛있네요!", "안녕히계세요", "내일 또 올게요!" 
	};
}
