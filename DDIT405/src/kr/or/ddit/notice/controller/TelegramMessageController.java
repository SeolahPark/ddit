package kr.or.ddit.notice.controller;

import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class TelegramMessageController {
	public void sendGet(String title) throws Exception {
		String chat_id = "-816976096";
		String url = "https://api.telegram.org/bot5932847148:AAG3BlBb-8-BHisHUc_L6sTosqE499yU2l4/sendMessage";
		String text = "";

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String time1 = format.format(time);

		text = "[DDIT :: 박설아 :: SYSTEM]\n";
		text += "[시스템 알림]\n";
		text += "게시글이 등록되었습니다.\n";
		text += "\n";
		text += "[제목] : " + title + "\n";
		text += "[시간] : " + time1 + "\n";

		URL url_ = new URL(url + "?chat_id=" + chat_id + "&text=" + URLEncoder.encode(text, "UTF-8"));
		HttpsURLConnection conn = (HttpsURLConnection) url_.openConnection();
		conn.setRequestMethod("POST");
		conn.addRequestProperty("User-Agent", "Mozilla/5.0");
		int respCode = conn.getResponseCode();
		System.out.println("텔레그램 알림 상태 : " + respCode);
	}
}
