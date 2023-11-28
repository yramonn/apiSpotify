package ramontech.apiSpotify.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

    @JsonProperty("access_token")
    private String acessToken;

    public LoginResponse(String acessToken) {
        this.acessToken = acessToken;
    }

    public LoginResponse() {
    }

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }
}
