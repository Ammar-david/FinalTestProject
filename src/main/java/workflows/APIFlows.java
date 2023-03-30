package workflows;

import extentions.APIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

    @Step("Business Flow : Get Team Property")
    public static String getTeamProperty(String jpath){
        response= APIActions.get("/api/teams/search");
        return APIActions.extractFromJSON(response, jpath);
    }
    @Step("Business Flow : Create New Team in Grafana")
    public static void postTeam(String name, String email){
        params.put("name", name);
        params.put("email", email);
        APIActions.post(params, "/api/teams");
    }

    @Step("Business Flow : Update Existing Team in Grafana")
    public static void updateTeam(String name, String email, String id){
        params.put("name", name);
        params.put("email", email);
        APIActions.put(params, "/api/teams/" + id);
    }
    @Step("Business Flow : Delete Existing Team from Grafana")
    public static void deleteTeam(String id){
       APIActions.delete(id);
    }
}
