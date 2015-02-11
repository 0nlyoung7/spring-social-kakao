package org.springframework.social.kakao.api.impl;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.HttpRequestDecorator;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class AbstractKakaoOperations {
	private final boolean isAuthorized;
	
	private final static String API_HOST = "https://kapi.kakao.com";
	
	private final static MultiValueMap<String, String> EMPTY_PARAMETER = new LinkedMultiValueMap<String, String>();
	
	public AbstractKakaoOperations(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("kakao");
		}
	}
	
	protected URI buildApiUri(String path) {
		return buildApiUri(path, EMPTY_PARAMETER);
	}
	protected URI buildApiUri(String path, MultiValueMap<String, String> parameters) {
		return URIBuilder.fromUri(API_HOST + path).queryParams(parameters).build();
	}
	
	class AdminKeyHeaderOAuth2RequestInterceptor implements ClientHttpRequestInterceptor {

		public ClientHttpResponse intercept(final HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
			HttpRequest protectedResourceRequest = new HttpRequestDecorator(request);
			HttpHeaders headers = protectedResourceRequest.getHeaders();
			// TODO Auto-generated method stub
			return execution.execute(protectedResourceRequest, body);
		}
		
	}
	
	protected HttpHeaders getAdminKeyHeader(String adminKey) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setAccept(Arrays.asList(new MediaType[]{MediaType.ALL}));
		headers.set("Authorization", "KakaoAK " + adminKey); //admin key�� header�� �����ؾ���
		
		return headers;
	}
}
