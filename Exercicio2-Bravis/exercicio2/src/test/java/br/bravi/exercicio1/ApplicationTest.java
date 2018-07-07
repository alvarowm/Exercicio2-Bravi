package br.bravi.exercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class ApplicationTest {

	static final String LOCALHOST_8080_PERSON_1 = "http://localhost:8080/person/1";
	static final String LOCALHOST_8080_PERSON = "http://localhost:8080/person/";
	static final String PERSON_JSON = "{\"name\":\"Teste\",\"contatcs\":[{\"contactType\":\"Zap\",\"contact\":\"123546\"}]}";
	static final String APPLICATION_JSON = "application/json";

	@Test
	public void testPersonInsercao() {
		HttpPost request = new HttpPost(LOCALHOST_8080_PERSON);
		StringEntity params;
		try {
			params = new StringEntity(PERSON_JSON);

			request.addHeader("content-type", APPLICATION_JSON);
			request.setEntity(params);

			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			assertEquals(httpResponse.getStatusLine().getStatusCode(), 201);
		} catch (Exception e) {
			assertFalse(true);
		}

	}

	@Test
	public void testPersonFindByID() {
		HttpGet request = new HttpGet(LOCALHOST_8080_PERSON_1);
		try {
			request.addHeader("content-type", APPLICATION_JSON);

			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		} catch (Exception e) {
			assertFalse(true);
		}

	}
	
	@Test
	public void testPersonUpdate() {
		HttpPut request = new HttpPut(LOCALHOST_8080_PERSON_1);
		StringEntity params;
		try {
			params = new StringEntity(PERSON_JSON);

			request.addHeader("content-type", APPLICATION_JSON);
			request.setEntity(params);

			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		} catch (Exception e) {
			assertFalse(true);
		}

	}
	
	@Test
	public void testPersonDelete() {
		HttpDelete request = new HttpDelete(LOCALHOST_8080_PERSON_1);
		try {
			request.addHeader("content-type", APPLICATION_JSON);

			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		} catch (Exception e) {
			assertFalse(true);
		}

	}

}
