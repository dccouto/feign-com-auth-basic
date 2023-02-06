package br.com.coutech.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertyResolver;

import br.com.coutech.facade.SsoFacade;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Configuration
public class FeignConfig {

	/**
	 *  Enable this bean if you want to add basic Authorization header for e.g.
	 * Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=
	 * */
	@Bean
	public SsoFacade createSsoFacade(PropertyResolver environment) {
		return Feign.builder()
				.encoder(new JacksonEncoder())
	            .decoder(new JacksonDecoder())
				.requestInterceptor(
						new BasicAuthRequestInterceptor(environment.getProperty("api-integration.sso.pcf.username"),
								environment.getProperty("api-integration.sso.pcf.password")))
				.target(SsoFacade.class, environment.getProperty("api-integration.sso.url-base"));

	}

}
