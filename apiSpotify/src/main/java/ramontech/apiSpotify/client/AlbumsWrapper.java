package ramontech.apiSpotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class AlbumsWrapper {
    private List<Album> items;

    public AlbumsWrapper(List<Album> items) {
        this.items = items;
    }

    public AlbumsWrapper() {
    }

    public List<Album> getItems() {
        return items;
    }

    public void setItems(List<Album> items) {
        this.items = items;
    }
}
