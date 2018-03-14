
import com.google.gson.JsonObject;

public class Vars {
    public static JsonObject main(JsonObject args) {
        JsonObject response = new JsonObject();
        response.addProperty("api_host", System.getenv("__OW_API_HOST"));
        response.addProperty("api_key", System.getenv("__OW_API_KEY"));
        response.addProperty("namespace", System.getenv("__OW_NAMESPACE"));
        response.addProperty("action_name", System.getenv("__OW_ACTION_NAME"));
        response.addProperty("activation_id", System.getenv("__OW_ACTIVATION_ID"));
        response.addProperty("deadline", System.getenv("__OW_DEADLINE"));
        return response;
    }
}
