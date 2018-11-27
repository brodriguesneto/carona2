package br.com.fiap.carona2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_social_media")
public class SocialMedia {
	
	public SocialMedia() {
		super();
	}

	public SocialMedia(String socialProfileId, String socialProvider, Boolean authenticate) {
		super();
		this.socialProfileId = socialProfileId;
		this.socialProvider = socialProvider;
		this.authenticate = authenticate;
	}

	@Id
	@Column(name="social_profile_id",length=45)
	private String socialProfileId;
	
	public String getSocialProfileId() {
		return socialProfileId;
	}

	public void setSocialProfileId(String socialProfileId) {
		this.socialProfileId = socialProfileId;
	}

	public String getSocialProvider() {
		return socialProvider;
	}

	public void setSocialProvider(String socialProvider) {
		this.socialProvider = socialProvider;
	}

	public Boolean getAuthenticate() {
		return authenticate;
	}

	public void setAuthenticate(Boolean authenticate) {
		this.authenticate = authenticate;
	}

	@Column(name="social_provider",length=45)
	private String socialProvider;
	
	@Column(name="authenticate",length=1)
	private Boolean authenticate;

}
