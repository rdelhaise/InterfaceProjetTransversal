package com.epsi.book.app.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GoogleBookDAO {
	
/*
	public JSONObject getData(String filter, String data) throws MalformedURLException, IOException, JSONException {
		data = URLEncoder.encode(data, "UTF-8");
        URL url = new URL("http://localhost:8080/book/search");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");

        String input = "{ \""+filter+"\": \""+data+"\"}";
        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());
        os.flush();

        if (conn.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
            throw new RuntimeException("Failed : HTTP error code : "
                + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }

        conn.disconnect();
		return null;

	}*/


		//googleBookDAO.getData("isbn", "2324020033");

	
		
	
		
	
}
