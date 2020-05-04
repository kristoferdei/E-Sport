import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class Main {
    public static void main(String[] args) throws RiotApiException {

        ApiConfig config = new ApiConfig().setKey("YOUR-API-KEY-HERE");

        RiotApi api = new RiotApi(config);

        Summoner summoner = api.getSummonerByName(Platform.EUNE, "kristoferdei98");

        System.out.println("Name: " + summoner.getName());
        System.out.println("Summoner ID: " + summoner.getId());
        System.out.println("Account ID: " + summoner.getAccountId());
        System.out.println("PUUID: " + summoner.getPuuid());
        System.out.println("Summoner Level: " + summoner.getSummonerLevel());
        System.out.println("Profile Icon ID: " + summoner.getProfileIconId());

    }
}